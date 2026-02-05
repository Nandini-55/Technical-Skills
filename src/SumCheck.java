import java.util.Scanner;

public class SumCheck {
    public static void main(String[] args) {
        // Given an array elements , check if their exists a pair (i,j) such that arr[i]+arr[j]==k and i!=j
        //Note : i and j are index value and k is the given sum 
        Scanner src = new Scanner(System.in);
       // Entering size of array 
        System.out.println("Enter no. of elements in array : ");
        int n = src.nextInt();
        int[] arr = new int[n];
        //Input value 
        for (int i=0 ; i<n;i++){
                arr[i] = src.nextInt();
            }

        System.out.println("Enter the key value : ");
        int k = src.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    found=true;
                    break;
                }
            }
        }

        if(found){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    
}