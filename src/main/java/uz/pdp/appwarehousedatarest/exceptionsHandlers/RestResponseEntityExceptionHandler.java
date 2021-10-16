package uz.pdp.appwarehousedatarest.exceptionsHandlers;

import lombok.Getter;
import org.hibernate.exception.ConstraintViolationException;
import org.postgresql.util.ServerErrorMessage;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.rest.core.RepositoryConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.postgresql.util.PSQLException;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler( RepositoryConstraintViolationException.class)
    public ResponseEntity<Object> handleAccessDeniedException(Exception ex) {

        RepositoryConstraintViolationException nevEx = (RepositoryConstraintViolationException) ex;

        return new ResponseEntity<>(processFieldErrors(nevEx.getErrors().getFieldErrors()),
                HttpStatus.NOT_ACCEPTABLE);
    }


    @ExceptionHandler( DataIntegrityViolationException.class )
    public ResponseEntity<?> handleConstraintViolationException(Exception ex){

        DataIntegrityViolationException datEx = (DataIntegrityViolationException) ex;

        ConstraintViolationException conEx = (ConstraintViolationException) datEx.getCause();

        PSQLException psqlException = (PSQLException) conEx.getCause();

        ServerErrorMessage serverErrorMessage = psqlException.getServerErrorMessage();

        Error error = new Error(HttpStatus.CONFLICT.value(), "conflicting value error");

        assert serverErrorMessage != null;

        error.addFieldError(serverErrorMessage.getTable(),
                            serverErrorMessage.getRoutine(),
                            serverErrorMessage.getDetail());

        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }


    private Error processFieldErrors(List<FieldError> fieldErrors) {

        Error error = new Error(HttpStatus.NOT_ACCEPTABLE.value(), "validation error");

        for (FieldError fieldError: fieldErrors) {
            error.addFieldError(fieldError.getObjectName(),
                    fieldError.getField(),
                    fieldError.getCode());
        }

        return error;
    }

    @Getter
    static class Error {

        private final int status;
        private final String message;
        private final List<FieldError> fieldErrors = new ArrayList<>();

        Error(int status, String message) {
            this.status = status;
            this.message = message;
        }

        public void addFieldError (String objName, String field, String message) {
            fieldErrors.add(new FieldError(objName, field, message));
        }

    }

}
