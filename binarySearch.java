// static can only call static.... super class is udsed to to call parent constructor
import java.util.Scanner;
public class binarySearch {
    // only for sorted array

 static int binarySearch(int arr[], int s, int e,int k){
     int mid;
     if(s>e)
       return -1;
      mid=(s+e)/2;
     if(k==arr[mid]){
         return mid;
     }
     else if(k>arr[mid]){
        return binarySearch(arr,mid+1,e,k);
     }
     else{
        return binarySearch(arr,s,mid-1,k);
     }
     
 }

public static void main(String[] args) { 

System.out.println("enter no of elements") ;
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int arr[]= new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}

System.out.println("enter elements to be searched") ;
int k= sc.nextInt();
int s=0;
int e=n-1;
System.out.println(binarySearch(arr,s,e,k)) ; 

}
    
}
