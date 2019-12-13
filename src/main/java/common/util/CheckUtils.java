package common.util;

import java.io.OutputStream;
import java.lang.annotation.Target;

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

//    public static boolean equals(String str1,String str2){
//        if(str1 == null || str2 == null){
//            return false;
//        } else  if (str1.equals(str2)){
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean equals(Integer int1,Integer int2){
//        if (int1 == null || int2 == null){
//            return false;
//        } else  if (int1.equals(int2)){
//            return true;
//        }
//        return false;
//    }
    
    public static boolean equals(Object obj1, Object obj2){


        if(obj1 == null || obj2 == null){
            return false;
        }
        if (obj1 == obj2){
            return true;
        }
        if(obj1 instanceof  Integer && obj2 instanceof Integer){

            if (((Integer)obj1).equals((Integer)obj2)){
                return true;
            }
        }
        if (obj1 instanceof String && obj2 instanceof String){

        }
        if (obj1 instanceof String && obj2 instanceof Integer){
            if (((String)obj1).equals(((Integer)obj2).toString())){
                return true;
            }
        }
        if (obj1 instanceof Integer && obj2 instanceof String){
            if ((((Integer)obj1).toString()).equals((String)obj2)){
                return true;
            }
        }

        return false;
    }
}
