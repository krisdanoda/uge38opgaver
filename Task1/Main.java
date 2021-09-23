public class Main {
    static void emptyLine(){
        System.out.println();
    }
    static void myPrint(String string){
        System.out.println(string);
    }
    static void myAge(String name, int age){
      System.out.println("My name is " + name + ", I am " + age + " years old");
    }
    public static void main(String[] args) {
	emptyLine();
    myPrint("Heya doing");
    myAge("Kris", 26);
    }
}
