import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int row = src.nextInt();
        System.out.println("Enter no. of columns:");
        int col = src.nextInt();
        int mat[][] = new int[row][col];
if(row==col){
    
        //Read elements using nested loops
        System.out.println("Enter elements values : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = src.nextInt();
            }
        }

        //calulate diagonal sums

        int left = 0;
        int right =0; 

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    left+=mat[i][j];
                }
                if((i+j+1)== col){
                    right+=mat[i][j];
                }
            }
        }

        //print the sum
        System.out.println("First diagonal sum : "+ left);
         System.out.println("Second diagonal sum : "+ right);
}else{
    System.out.println("Row and columns no. must be equal to calculate diagonals!");
}
    }
}
