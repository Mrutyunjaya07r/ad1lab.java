import java.util.Scanner;
public class Q7 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a number: ");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println(" the factorial is: "+ fact);

    }
    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}
