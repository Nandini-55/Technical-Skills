import java.util.Scanner;

public class PrintMatrix {
    //Write a program to print user defined matrix
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int row = src.nextInt();
        System.out.println("Enter no. of columns:");
        int col = src.nextInt();
        int mat[][] = new int[row][col];

        //Read elements using nested loops
        System.out.println("Enter elements values : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = src.nextInt();
            }
        }
        //print the matrix
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print( mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
