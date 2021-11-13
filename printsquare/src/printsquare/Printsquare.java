/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printsquare;

/**
 *
 * @author Admin
 */
public class Printsquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printSquare(1, 5);
    }
    
 public static void printSquare(int min, int max) {
    for(int i = min; i <= max; i++) {
        for(int j = i; j <= max; j++) {
            System.out.print(j); 
        }
        for(int k = 0; k < i - min; k++) {
            System.out.print(min + k);
        }
        System.out.println();
    }
}
}
