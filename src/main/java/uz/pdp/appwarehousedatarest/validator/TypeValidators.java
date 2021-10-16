package uz.pdp.appwarehousedatarest.validator;

import java.util.UUID;

public abstract class TypeValidators {

    public static boolean check(String string){
        return (string == null || string.isEmpty());
    }

    public static boolean check(Boolean b){
        return (b == null);
    }

    public static boolean check (Object o){
        return o == null;
    }

    public static boolean check(Double d){
        return (d == null || d == 0);
    }

    public static String generateCode() {
        return UUID.randomUUID().toString();
    }


}
