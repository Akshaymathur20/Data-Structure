
public class Recursion1 {
    
    public static void main(String[] args) {
        
        //write a function  of  Hello  world
        message();

    }
    static void message(){
        System.out.println("Hello world");
        message1();
    }
    static void message1(){
        System.out.println("Hello world");
        message2();
    }
    static void message2(){
        System.out.println("Hello world");
    }

}
