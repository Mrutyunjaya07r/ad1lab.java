import java.util.Scanner;
public class Q21 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+1;
        }
        System.out.println(" the sum is "+ sum);

    }
}
