public class Q2 {
    public static void main(String arg[]){
        int arr[]={10,20,30,40,70};
        int max=0;
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[max]<arr[i]) {
                arr[max] = arr[i];
            }
        }
        System.out.println(" the max is "+ arr[max]);
        for(int i=0;i<arr.length;i++){
            if(arr[min]>arr[i]){
                arr[min]=arr[i];
            }
        }
        System.out.println(" the min is "+ arr[min]);

    }
}
