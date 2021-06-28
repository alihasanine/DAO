package lab2;

public class LambdaDemo {

    public static void main(String[] args) {
        String test1 = StringUtils.betterString("Ahmed","Mohamed", (s1,s2)-> (s1.compareTo(s2)> 0) ? true : false );
        System.out.println(test1);

        String check = "ITI@";

        //Character.isLetter(check)

        Boolean test2 = StringUtils.containSymbol(check, (s) -> {
            for(var x :s.toCharArray()){
                if  (Character.isLetter(x) == false) return true;
            }
            return false;
        });

        System.out.println(test2);

    }
}
