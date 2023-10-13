import java.util.Scanner;
public class Q27 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a base ");
        int base=sc.nextInt();
        System.out.println(" enter a power ");
        int power=sc.nextInt();
        int pow=powermanual(base,power);
        System.out.println(" the power is: "+pow);
    }
    public static int powermanual(int b,int p){
        if(p==0){
            return 1;
        }
        else{
            return b*powermanual(b,p-1);
        }
    }
}
