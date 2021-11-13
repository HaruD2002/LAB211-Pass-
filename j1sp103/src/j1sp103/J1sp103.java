/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp103;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.*;
import javafx.util.converter.LocalDateTimeStringConverter;

/**
 *
 * @author Admin
 */
public class J1sp103 {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {

        System.out.print("Enter Date 1:");
        String s1 = takeInput();
        System.out.println("Enter Date 2");
        String s2 = takeInput();

        Date a = new SimpleDateFormat("dd/MM/yyyy").parse(s1);
        Date b = new SimpleDateFormat("dd/MM/yyyy").parse(s2);

        if (a.before(b)) {
            System.out.println("first date is before the second date");
        } else if (b.before(a)) {
            System.out.println("second date is before the first date");
        }
        else{
            System.out.println("Two date are the same");
        }
    }

    public static String takeInput() {
        String s;
        while (true) {
            s = sc.nextLine().trim();
            if (s.isEmpty()) {
                System.err.print("Empty Date. Please re-enter:");
            }
            while (isValidDate(s) == false) {
                System.err.println("This is wrong please re-enter:");
                s = sc.nextLine();
            }
            if (checkFormat(s) == false) {
                System.err.print("Not value answer.Please re-enter: ");
            } else {
                return s;
            }
        }
    }

    public static boolean checkFormat(String s) {
        String regex = "^[0-9]{0,9}(\\/[0-9]{0,9})(\\/[0-9]{0,9})?$";
        return s.matches(regex);
    }

    private static boolean isValidDate(String s) {
        String nf = "dd/MM/yyyy";

        try {
            SimpleDateFormat format = new SimpleDateFormat(nf);
            format.setLenient(false);
            format.parse(s);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
}
