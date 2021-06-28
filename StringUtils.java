package lab2;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class StringUtils {
    public static String betterString(String s1, String s2, BiPredicate<String,String> p){

         if(p.test(s1, s2))       return s1;
         else return s2;
    }

    public static boolean containSymbol (String s1, Function<String,Boolean> f){

         return f.apply(s1);
    }
}
