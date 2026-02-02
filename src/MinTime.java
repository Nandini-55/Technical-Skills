import java.util.Scanner;

public class MinTime {
    
//Given an integer array a of size n . In one second you can increase the value of one element by 1 . find the minimum time in seconds to make all elements of the array equal .

//observation : to minimise time make all elements equal to the maximum element in the array 
//approach - 
//step 1 : find the maximum lement in the array 
//step 2 : for every element calculate how much it needs to be increased to reach the maximum
//step 3 : sum all those differences
public static void main(String[] args) {
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

    int minTime =0;
    // add the difference of each element and max element together 
    for(int i=0;i<arr.length;i++){
        minTime += (max-arr[i]);
    }

    System.out.println(minTime);
}
}
