import java.util.*;
public class Matrix{
    double[][] table;
    int row, column;
    public Matrix(){
        Scanner n = new Scanner(System.in); //initiates scanner for size of matrix.
        boolean validInput = false;
        while(!validInput){
            try{
                System.out.println("Enter number of rows: ");
                row = n.nextInt();
                validInput = true;
            }
            catch(IllegalFormatException e){
                System.out.println("not a whole number. try again");
            }
        }
        validInput = false;
        while(!validInput){
            try{
                System.out.println("Enter number of columns: ");
                column = n.nextInt();
                validInput = true;
            }
            catch(IllegalFormatException e){
                System.out.println("not a whole number. try again");
            }
        } //End of both try/while blocks for taking in input for matrix size
        table = new double[row][column];

        n.close();
    }
    public static void matrixPrint(double[][] tableIn){
        for(int i = 0; i < tableIn.length; i++){
            System.out.print("| ");
            for(int j = 0; j < tableIn[i].length; j++){
                System.out.print(tableIn[i][j] + " ");
            }
            System.out.print("| \n");
        }
    }
}