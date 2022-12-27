public class Recursion2_message {
    public static void main(String[] args) {
        //write a functino that takes in a nubmer and prints it
        //print first 5 number : 1 2 3 4 5
        print(1);
    }
    static void print(int n){
        if(n==5){             //base condition to  stop
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);   //recursive call
    }
    
    
}
