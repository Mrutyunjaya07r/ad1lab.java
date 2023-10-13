import java.util.Scanner;
public class Q1 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter an array: ");
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" the sum of array is " + sumofarray(arr));
    }
    public static int sumofarray(int array[]){
        int sum=0;
        for(int j=0;j<array.length;j++){
            sum=sum+array[j];
        }
        return sum;
    }
}
