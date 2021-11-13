/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h202;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SH202 {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "hello there!";
        String input2 = null;
        String input3 = "";
        printReverse(input3);
        printReverse(input);
//        printReverse(input2);
//        System.out.println("Enter value");
//        String input4 = sc.nextLine();
//        printReverse(input4);
    }
    
        public static void printReverse(String input) {       
        StringBuilder rev_input = new StringBuilder();
        if (input == null) {
            System.out.println();
            return;
        }
        if (input.length() == 0) {
            System.out.println();           
        }
        
        for (int i = 0; i < input.length(); i++) {
            rev_input.append(input.charAt(i));
        }
        rev_input.reverse();
        System.out.println(rev_input);
    }
    
}
