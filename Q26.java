import java.util.Scanner;
public class Q26 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a number: ");
        int number=sc.nextInt();
        System.out.println(" enter a base: ");
        int base=sc.nextInt();
        dectohex(number,base);
    }
    public static void dectohex(int num,int base){
        String conversion="0123456789ABCDEF";
        char digit=(char)(num%base);
        num=num/base;
        if(num!=0){
            dectohex(num,base);
        }
        System.out.println(conversion.charAt(digit));
    }
}
