import java.util.Scanner;
public class Q3 {
    public static void main(String arg[]) {
        int arr[] = {20, 30, 40, 50, 60};
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a kth element: ");
        int k = sc.nextInt();
        for(int i=k;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int j=0;j<k;j++){
            System.out.println(arr[j]);
        }
    }
}
