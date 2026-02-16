import java.util.Scanner;
public class LowerDiagonal {
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

        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i>j){
                   sum+=mat[i][j];
                }
            }
        }

        //print the sum
        System.out.println("Lower  Diagonal sum : "+ sum);
}else{
    System.out.println("Row and columns no. must be equal to calculate Lower  Diagonal sum!");
}
    }
}

