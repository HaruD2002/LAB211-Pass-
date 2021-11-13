/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsp0057;

import java.util.Scanner;


public class valuate {
    private static final Scanner sc = new Scanner(System.in);
   
    // int choice co phai la chu ko, co phai la double ko 
    public static int choice(){
        
        
        while(true){
            int choice = 0;
            int a = sc.nextInt();
            if(a<1 && a>3)
                System.out.println("Invalid Input");
            else
                return choice;
        }        
    }
    public static String checkUserS(){
        while(true){
            String s = sc.nextLine().trim();
            if(s.isEmpty() == true)
                System.err.println("User cant leave the userfield empty!!");                 
            else if(s.length() <5)
                System.err.println("The username is too short!!");
            else if(checkspace(s) == true)
                System.err.println("The usernaem contain space!!");                                          
            else 
                return s;
            
             
            }
        }
    
    public static String checkPass(){
            while(true){
                String s = sc.nextLine().trim();
                if(s.isEmpty() == true)
                System.err.println("User cant leave the password empty!!");
            else if(s.length() <8)
                System.err.println("The password enter is too short please try again!!");
            else if(checkspace(s) == true)
                    System.err.println("The user password contain space");
            else if(checkSpec(s) == false)
                    System.err.println("The User password do not contain any special character!!");
            //"^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$" regex            
            else 
                return s;                                      
            }
                       
        }
    
    public static boolean checkspace(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ')                                    
            return true;            
        }        
        return false;
    }
    
     public static boolean checkSpec(String s){
        for (int i = 0; i < s.length(); i++) {
            char ns = s.charAt(i);
            
            if(ns>=33 && ns<=47 || ns>=58 && ns <=64 || ns>=91 && ns<=96 || ns>=123 && ns<=126)
                return true;
        }                             
        return false;
    }  
}
   

