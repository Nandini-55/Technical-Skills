import java.util.Scanner;

public class ProductArray {
    //Given an integer array a find and return the product array of same size where the ith element of the product array will be equals to the products of all elements divided by the ith element of the array 
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
    //Entering size of array 
    System.out.println("Enter no. of elements in array : ");
    int n = src.nextInt();
    int[] arr = new int[n];
    //Input value and Find product value
    int product=1;
    for (int i=0 ; i<n;i++){
            arr[i] = src.nextInt();
           product *=  arr[i];
        
    }

    int pro[] = new int[n];
    for (int i=0 ; i<n;i++){
           pro[i]=product/arr[i];
        }

     for(int i=0;i<arr.length;i++){
        System.out.print(pro[i]+" ");
    }
   }
}
