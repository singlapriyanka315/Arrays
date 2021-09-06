import java.util.Scanner;
public class max_min_element {
    static void maximum(int arr[], int n){
        int i;
        int max =arr[0];
        int min = arr[1];
        for( i=2;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.print("No of elements-");
        int n = sc.nextInt();
        System.out.print("elements-");

        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
         maximum(arr,n);







    }

    
}
