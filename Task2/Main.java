public class Main {
    static float mySum(float a, float b){
        float sum = a + b;
        return sum;
    }
    static String myUpperCase(String str){
        str = str.toUpperCase();
        return str;
    }
    static boolean isName(String str){
        //char c = str.charAt(0);
        boolean b = Character.isUpperCase(str.charAt(0));
        return b;

    }

    public static void main(String[] args) {
    System.out.println(isName("kris"));


    }
}
