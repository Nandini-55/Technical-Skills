import java.util.Scanner;

public class Transpose { 

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Enter no. of rows: ");
        int row = src.nextInt();
        System.out.println("Enter no. of columns: ");
        int col = src.nextInt();

        int mat[][]= new int[row][col];
        System.out.println("Enter element values :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]= src.nextInt();
            }
        }

         for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
               int val =  mat[i][j];
               mat[i][j]= mat[j][i];
               mat[j][i] = val ; 
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
