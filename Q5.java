import java.util.Scanner;
public class Q5 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a array: ");
        int array[]=new int[5];
        for(int i=0;i<array.length;i++){
             array[i]=sc.nextInt();
        }
        System.out.println(" the +ve missing number is: "+ missing(array));
    }
    public static int missing(int array[]){
        for(int i=0;i<array.length;i++){
            boolean flag=true;
            for(int j=0;j< array.length;j++){
                if(array[j]==i){
                     flag=false;
                    break;
                }
            }
            if(flag==true) {
                return i;
            }
        }
        return array.length;
    }
}
