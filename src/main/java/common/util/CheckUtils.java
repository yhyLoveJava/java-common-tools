package common.util;

public class CheckUtils {
    public static boolean isAnyEmpty(String ... str) {
        if (str != null) {
            for (int i = 0; i < str.length; i++) {
                if (str[i] == null)
                    return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isEmpty(Object[] obj){
        if( obj == null || obj.length == 0){
            return  true;
        }

        return false;
    }
}
