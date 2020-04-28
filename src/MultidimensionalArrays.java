import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main( String [] args) {
        // declare multidimensional array for for and column
        // create it as 10 row and 5 column
        String [][] multiArray = new String[10][5];
        // run nested for loop with outer loop running the row and
        // inner loop running column
        // when the inner loop is done print new line
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                multiArray[i][j] = "row " + i + " col " +j + " ";
                System.out.print(multiArray[i][j]);
            }
            System.out.print("\n");
        }
        // multiplication table
        System.out.println("\n------------------------------\nMultiplication Table\n");
        // declare and create multidimensional array
        int [][] multiTable = new int[13][13];
        // run nested for loop with outer loop running the row and
        // inner loop running column
        // when the inner loop is done print new line
        // in the inner loop compute the product of row and column 
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                multiTable[i][j] = i * j;
                System.out.print(multiTable[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
