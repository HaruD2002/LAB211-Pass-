/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0074;

/**
 *
 * @author Admin
 */
public class Calculate implements Interface {

    @Override
    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int[][] sum_matrix = new int[row][col];
        if (row != row2 || col != col2) {
            return null;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum_matrix;
    }

    @Override
    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int[][] sub_matrix = new int[row][col];
        if (row != row2 || col != col2) {
            return null;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sub_matrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return sub_matrix;
    }

    @Override
    public int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        // dien kien sai
        
        if(col != row2){
            return null;
        }
        // cot ma tran 1 bang hang ma tran thu 2
//        if (row != col2) {
//            return null;
//        }
        int[][] result = new int[row][col2];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col2; j++) {
                for (int k = 0; k < col; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

}
