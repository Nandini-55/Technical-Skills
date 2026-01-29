//given an array of intergers nums calculate the pivot index of this array 

//The pivot index is the index where the sum of no.s stricly to the left to the index is equals to sum of all the no.s to the right -- if the index is on the left edge of the array then the left sum is 0 , if the index is on the left edge of the array the sum is 0 , because there are no elements on the left edge . this also applies to the right edge of the array . return the left most pivot index , if no such index exists return -1.
//E.G. - 1 7 3 6 5 6 - PIVOT=3

//right sum = pf[n-1] - pf[i]

import java.util.Scanner;

public class PivotIndex {

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
            left[i] = i==0?nums[0]:left[i-1]+nums[i];
            total+=nums[i];
        }

        for (int i=n-1 ; i>=0;i--){
            right[i]=i==n-1?nums[n-1]:right[i+1]+nums[i];
        }
        int pivot =-1;
        for (int i=1 ; i<n-1;i++){
            if(left[i-1]==right[i+1]){
                pivot=i;
               break;
            }
        }

        System.err.println(pivot); 
        
        //Approach 2: Efficient (Time Complexity = n & Spcae Complexity =1)
        
        int pivot2 =-1;

        int left_sum = 0;
        for(int i=0;i<nums.length;i++){
            if(left_sum == (total - left_sum -nums[i])){
                pivot2= i;
            }
            left_sum+=nums[i];
        }
        System.err.println(pivot2);

        }
}