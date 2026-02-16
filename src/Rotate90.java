import java.util.Scanner;

public class Rotate90 {
     //Rotate a square matrix by 90 degree clockwise (bottom right as a corner)
    // Approach: Step 1 = transpose the matrix 
    //      Step 2 = reverse element of every row
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

        //does transpose
         for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
               int val =  mat[i][j];
               mat[i][j]= mat[j][i];
               mat[j][i] = val ; 
            }
        }

        //reverse rows
        for(int i=0;i<row;i++){
            for(int j=0;j<col/2;j++){
               int val =  mat[i][j];
               mat[i][j]= mat[i][mat[i].length-1-j];
               mat[i][mat[i].length-1-j] = val ; 
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
