// Q - Count no. of elements having atleast 1 element greater than itself 

// Intution - find the maximum element and count the elements smaller than that

// Observation - For every max element there would not be any element greater than 

import java.util.Scanner;

class SmallerOne{
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n = src.nextInt();
        int[] nums = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i=0 ; i<n;i++){
            nums[i] = src.nextInt();
            if(nums[i]>max) {
                max = nums[i];
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<max) {
                count++;
            }
        }
        System.out.println(count);
        


    }
}