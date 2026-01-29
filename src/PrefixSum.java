import java.util.Scanner;

public class PrefixSum {

     public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        //Entering size of array 
        System.out.println("Enter no. of elements in array : ");
        int n = src.nextInt();
        int[] nums = new int[n];
        int[] pre=new int[n];
        //Input value in array 
        for (int i=0 ; i<n;i++){
            nums[i] = src.nextInt(); 
            pre[i] = i==0?nums[0]:pre[i-1]+nums[i];
        }

        for (int i=0 ; i<n;i++){
            System.err.print(pre[i]+" ");
        }
            
        }
}