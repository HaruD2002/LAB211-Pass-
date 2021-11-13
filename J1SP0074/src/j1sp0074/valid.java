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
public class valid {

    private static final Scanner sc = new Scanner(System.in);

    public static int takeChoice(int min, int max) {
        while (true) {
            try {

                int choice = Integer.parseInt(sc.nextLine());
                //--
                while (choice < min || choice > max) {
                    System.err.println("Invalid option");
                    choice = Integer.parseInt(sc.nextLine().trim());
                }

                return choice;
            } catch (NumberFormatException e) {
            }

        }
    }

    public static int takeNotInRangeChoice() {
        while (true) {
            try {

                int choice = Integer.parseInt(sc.nextLine());
                //--
                while (choice < 0) {
                    System.err.println("Invalid option");
                    choice = Integer.parseInt(sc.nextLine().trim());
                }

                return choice;
            } catch (NumberFormatException e) {
            }

        }
    }
    
     public static int validInput() {
         while(true){
            try{
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            }catch(NumberFormatException e){
                System.out.println("Values of matrix must be the number!!!");
                System.out.print("Enter again: ");
            }
    }

}
}
