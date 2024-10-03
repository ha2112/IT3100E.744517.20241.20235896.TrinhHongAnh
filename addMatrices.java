import java.util.Scanner;

public class addMatrices {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = keyboard.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = keyboard.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];
        System.out.println("Enter the elements of matrix 1: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix1[i][j] = keyboard.nextInt();
            }
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix2[i][j] = keyboard.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Resultant matrix after addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.exit(0);
    }
}
