package j1sp001;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.math.*;
import java.lang.Exception;
public class J1SP001 {
    
    static void sort(int []a){
        int temp;
       for (int i = 0; i < a.length - 1; i++) {         
            for (int j = 0; j < a.length - 1 - i; j++) {                
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
       }
       
    }
    
      //bubble sort
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);          
        System.out.println("Enter the number of Array:");
        int n=0;
        
       
        
         do {
            while (!sc.hasNextInt()) {
                String input = sc.next();
                System.out.println("Not a number");    
            System.out.println("Enter the number of Array:");}
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Negative Number");
                System.out.println("Enter the number of Array:");
            }
        } while (n<0); 
                
            int []a = new int [n];
        
        for (int i = 0; i < n; i++) {  
            a[i] = (int)(Math.random()*n);
        } 
        System.out.println("Unsorted Array:" + Arrays.toString(a) );
       
        sort(a);
        
        System.out.println("Sorted Array:" + Arrays.toString(a));
        }
        
        
    }