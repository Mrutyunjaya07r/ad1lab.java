import java.util.Scanner;
public class Q8 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a number: ");
        int n=sc.nextInt();
        int fibo=fibonacci(n);
        System.out.println(" the fibonacci is: "+fibo);

    }
    public static int fibonacci(int num){
        if(num==0){
            return 0;
        }
        else if(num==1){
            return 1;
        }
        else{
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
}
