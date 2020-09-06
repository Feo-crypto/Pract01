import java.util.Scanner;
public class FactorialPract1 {
    public static long Factorial(long n){
        if (n<=0){
            return 1;

        }else {
            return n*Factorial(n-1);
        }
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        long number=input.nextLong();
        System.out.println(Factorial(number));
    }
}
