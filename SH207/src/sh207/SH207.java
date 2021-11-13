/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh207;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class SH207 {

    /**
     * @param args the command line arguments
     */
    
  
    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s; 
        s = sc.nextLine().trim();
        System.out.println(secondHalfLetters(s));
        
   
     
}
    public static int secondHalfLetters(String s){
        
        int count =0;
        for (int i = 0; i < s.length()-1; i++) {           
            char ns = s.charAt(i);
                        if(ns>=78 && ns <=90 || ns>=110 && ns<=122){
                            count++;
                        }                
        }
        
        return count;
    }
}

