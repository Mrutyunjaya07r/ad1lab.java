import java.util.Scanner;
public class Q25 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a num1: ");
        int n1=sc.nextInt();
        System.out.println(" enter a num2: ");
        int n2=sc.nextInt();
        int hcf=gcd(n1,n2);
        System.out.println(" the gcd is: "+hcf);
    }
    public static int gcd(int n1,int n2){
        if(n1==0){
            return n2;
        }
        else if(n2==0){
            return n1;
        }
        else{
            return gcd(n1%n2,n1);
        }
    }
}
