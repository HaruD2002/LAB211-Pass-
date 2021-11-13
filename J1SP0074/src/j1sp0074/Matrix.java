 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0074;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Matrix {

    public void menu() {
        while (true) {
            System.out.println("--------------Matrix calculator-----------------");
            System.out.println("1-Matrix addition");
            System.out.println("2-Matrix subtraction");
            System.out.println("3-Matrix multiplicaltion");
            System.out.println("4-Exit");
            System.out.print("Enter your choice: ");
            int choice = valid.takeChoice(1, 4);

            switch (choice) {
                case 1:
                    addmatrix();
                    break;
                case 2:
                    submatrix();
                    break;
                case 3:
                    multimatrix();
                    break;
                case 4:
                    return;
                default:
                    System.out.println();
            }
            System.out.println();
        }
    }
    private final Scanner sc = new Scanner(System.in);

    public int[][] matrix(int n) {
        System.out.print("Input " + n + " Matrix row: ");
        int row = valid.validInput();
        System.out.print("Input " + n + " Matrix column: ");
        int col = valid.validInput();
        int[][] myMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter number of Matrix" + n + "[" + i + "][" + j + "]: ");
                myMatrix[i][j] = valid.validInput();
            }
        }
        return myMatrix;
    }

    public void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]" + " ");
            }
            System.out.println("");
        }
    }
    public Interface matrix_calculate = new Calculate();

    public void addmatrix() {
        System.out.println("-----------------Matrix subtraction-----------------------");
        int[][] matrix1 = matrix(1);
        int[][] matrix2 = matrix(2);
        int[][] sum_matrix = matrix_calculate.additionMatrix(matrix1, matrix2);

        if (sum_matrix == null) {
            System.out.println("Matrix addition must contain 2 matrix with the same dimention");
            return;
        }

        //-------------------Result---------------------------//
        System.out.println("-------------------Result-------------------");
        printMatrix(matrix1);

        System.out.println("+");
        
        printMatrix(matrix2);
        
        System.out.println("=");
        
        printMatrix(sum_matrix);
    }
    
    public void submatrix(){
        int[][] matrix1 = matrix(1);
        int[][] matrix2 = matrix(2);
        int[][] sub_matrix = matrix_calculate.subtractionMatrix(matrix1, matrix2);

        if (sub_matrix == null) {
            System.out.println("Matrix subtraction must contain 2 matrix with the same dimention");
            return;
        }

        //-------------------Result---------------------------//
        System.out.println("-------------------Result-------------------");
        printMatrix(matrix1);

        System.out.println("-");
        
        printMatrix(matrix2);
        
        System.out.println("=");
        
        printMatrix(sub_matrix);
    }
    
    public void multimatrix(){
        System.out.println("-----------------Matrix multiplication---------------------");
        int[][] matrix1 = matrix(1);
        int[][] matrix2 = matrix(2);
        int[][] mul_matrix = matrix_calculate.multiplicationMatrix(matrix1, matrix2);
        
        if (mul_matrix == null) {
            System.out.println("Matrix multiplication must contian 1 matrix with the column equal to another matrix row");
            return;
        }
      

        //-------------------Result---------------------------//
        System.out.println("-------------------Result-------------------");
        printMatrix(matrix1);

        System.out.println("*");
        
        printMatrix(matrix2);
        
        System.out.println("=");
        
        printMatrix(mul_matrix);
    }
}


