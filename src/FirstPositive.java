import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

//ArrayList<Integer> ans = new ArrayList<>();
//ArrayList<Integer> - this means we are creating a dynamic list that will store integer values.
//ans - this is the name of the variable (used to store the result)
//new ArrayList<>() - This creates a new empty ArrayList object in memory

public class FirstPositive {
    //Given an integer A . Find and return first positive A integers in ascending order containing only digits 1,2 and 3.
    //e.g. = A =5
    // result - 1 2 3 11 12 

    //Algorithm - 
    //initialise queue with 1,2,3
    //repeat A times:
    //  Remove front element temp
    //  Add it to result
    //  Push temp*10+1,temp*10+2,temp*10+3 and add in queue
    //Restun res
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = src.nextInt();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        int[] res = new int[a];

        for(int i=0;i<a;i++){
            int temp = q.remove();
            res[i]=temp;
            for(int j = 1;j<=3;j++){
                q.add(temp*10+j);
            }
            
        }

        for(int val:res){
            System.out.print(val+" ");
        }
        src.close();



    }
}
