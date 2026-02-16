import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int row = src.nextInt();
        System.out.println("Enter no. of columns:");
        int col = src.nextInt();
        int mat[][] = new int[row][col];
    
        //Read elements using nested loops
        System.out.println("Enter elements values : ");
        int[] colSum = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = src.nextInt();
                colSum[j] += mat[i][j]; 
            }
        }

        for(int i=0;i<col;i++){
            System.out.print(colSum[i]+" ");
        }

    }
}