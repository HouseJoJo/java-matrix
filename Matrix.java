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
                if(row <= 0) throw new IllegalArgumentException();
                validInput = true;
            }
            catch(IllegalFormatException e){
                System.out.println("not a proper value. try again");
            }
        }
        validInput = false;
        while(!validInput){
            try{
                System.out.println("Enter number of columns: ");
                column = n.nextInt();
                if(column <= 0) throw new IllegalArgumentException();
                validInput = true;
            }
            catch(IllegalFormatException e){
                System.out.println("not a proper value. try again");
            }
        } //End of both try/while blocks for taking in input for matrix size
        table = new double[row][column];
        for(int i = 0; i < row; i++){ //Loop to fill in matrix values.
                for(int j = 0; j < column; j++){
                    try{
                    System.out.println("Type a value for for element "+i+", "+ j);
                    table[i][j] = n.nextDouble();
                    matrixPrint(this.table);
                    }
                    catch(InputMismatchException e){
                        System.out.println("Invalid input. Try again.");
                        n.reset();
                        j--;
                    }
                }
        }
        n.close();
    }

    public Matrix(double[][] table){
        this.table = table;
        row = table.length;
        for(int i = 0; i < row; i++){
            if(table[i].length != table[0].length){
                throw new IllegalArgumentException("2-d Array is not rectangle size");
            }
        }
        column = table[0].length;
    }

    public static void matrixPrint(double[][] tableIn){
        for(int i = 0; i < tableIn.length; i++){
            System.out.print("|");
            System.out.print("\t");
            for(int j = 0; j < tableIn[i].length; j++){
                System.out.print(tableIn[i][j]);
                System.out.print("\t");
            }
            System.out.print("|");
            System.out.print("\t\n");
        }
    }

    public static void main(String[] args){
        double[][] out = {
            {3, 2, 4},
            {4, 6, 8},
            {10, 4, 25}
        };
        //matrixPrint(out);
        Matrix test = new Matrix();
    }
}