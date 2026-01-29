//Given an array element count no. of equilibrium index 
//An index is said to be equilibrium if sum of all elements left  of ith index is equals to the sum of all elements right of the ith index
//Note - if i==0 then left_sum=0 and if i==n-1 then right_sum=0
//E.G. - 1 7 3 6 5 6 - count =0
//E.g. ->  -7 , 1 ,5 ,2 ,-4 , 3 , 0
// 3 -2 2
// 3 -1 2 -1 1 2 1
//
import java.util.Scanner;

public class Equilibrium {
    public static void main(String[] args) {
        //Approach 1 : Brute force (Time complexity :3n=n & space complexity = 2n=n)
        Scanner src = new Scanner(System.in);
        //Entering size of array 
        System.out.println("Enter no. of elements in array : ");
        int n = src.nextInt();
        int[] nums = new int[n];
        int[] left=new int[n];
        int[] right=new int[n];

        int total = 0;//for Approach 2
        //Input value in array 
        for (int i=0 ; i<n;i++){
            nums[i] = src.nextInt(); 
            left[i] = i==0?0:(left[i-1]+nums[i-1]);
            total+=nums[i];
        }

        for (int i=n-1 ; i>=0;i--){
            right[i]=i==n-1?0:(right[i+1]+nums[i+1]);
        }
         for (int i=0 ; i<n;i++){
            System.out.print(left[i]+" ");
         }
         System.out.println();
        for (int i=0 ; i<n;i++){
                System.out.print(right[i]+" ");
         }
         System.out.println();
        int count = 0;
        for (int i=0 ; i<n;i++){
            if(left[i]==right[i]){
                System.err.println(i); 
               count++;
            }
        }
        if(count==0){
            System.out.print(-1);
        }
        System.err.println("No. of equilibrium index :"+count);   
    }
}
