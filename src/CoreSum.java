import java.util.Scanner;

public class CoreSum {
    //write a program to find the sum of core elements of a matrix
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);

        System.out.println("Enter no. of rows: ");
        int row = src.nextInt();
        System.out.println("Enter no. of columns: ");
        int col = src.nextInt();

        int mat[][]= new int[row][col];

        int sum =0;

        System.out.println("Enter element values :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]= src.nextInt();
                if(i !=0 && j!=0 && i!=row-1 &&j!=col-1){
                    sum+=mat[i][j];
                } 
            }
        }

        System.out.println("Sum of frame elements is : "+sum );
    }
}
 