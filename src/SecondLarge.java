import java.util.Scanner;

public class SecondLarge {
    public static void main(String[] args) {
        //given an integer array a you have to find the second largest element in the array or report that no such element exist 
        Scanner src = new Scanner(System.in);
    //Entering size of array 
    System.out.println("Enter no. of elements in array : ");
    int n = src.nextInt();
    int[] arr = new int[n];
    //Input value and Find maximum value
    int max = Integer.MIN_VALUE;
    for (int i=0 ; i<n;i++){
            arr[i] = src.nextInt();
            if(arr[i]>max) {
                max = arr[i];
            }
    }

    if(n!=1){
    int sec = Integer.MIN_VALUE;

    for (int i=0 ; i<n;i++){
            if(arr[i]<max && arr[i]>sec) {
                sec = arr[i];
            }
    }

    System.out.println(sec);
    }else{
        System.out.println(-1);
    }

    
    }
}
