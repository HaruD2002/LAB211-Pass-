
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class validInfo {

    private static final Scanner sc = new Scanner(System.in);

    public static String validNewInput() {

        while (true) {
            String result = sc.nextLine();
            if (result.isEmpty()) {
                System.err.print("Your input is empty, please try again: ");
            } else {
                return result;
            }
        }
    }

    public static int takeChoice() {
        while (true) {
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
                
            } catch (NumberFormatException e) {
            }
            return choice;
        }
    }
    
   
    public static int validA() {
        while (true) {
            int n = 0;
            do {
                while (!sc.hasNextInt()) {
                    String input = sc.nextLine();
                    System.err.println("Not a number");
                }
                n = sc.nextInt();
                if (n < 0) {
                    System.err.println("Negative Number");
                } else {
                    return n;
                }

            } while (n < 0);
        }
    }

    public static String checkInputStringEmpty(String s) {
        String r = sc.nextLine().trim();
        if (r.isEmpty()) {
            System.err.println("Keep");
            return s;
        }
        return r;
    }

    public static int checkInputIntEmpty(int i) {
        while (true) {
            try {
                String result = sc.nextLine().trim();
                if (!result.isEmpty()) {
                    return Integer.parseInt(result);
                } else {
                    return i;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter again:");
            }
        }
    }

    public static String inputInRange(int choice, int min, int max) {
        while (true) {
            String s = sc.nextLine().trim();
            if (choice >= min || choice <= max) {
                if (s.isEmpty()) {
                    System.err.println("This String is Empty");
                } else {
                    return s;
                }
            } else {
                System.err.println("Invalid option");
            }

        }

    }
    
    public static String updateItem(){
        String s = sc.nextLine();                
        return s;
    }
}
