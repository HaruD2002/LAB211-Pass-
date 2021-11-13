
import java.util.ArrayList;
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
public class viewDoctor {
    ControlDoc dc = new ControlDoc();
    Scanner sc = new Scanner(System.in);       
    public void menu() throws NumberFormatException {
        int choice;
        while (true) {
            System.out.println("---Doctor management program---");
            System.out.println(" 1. Add doctor.");
            System.out.println(" 2. Update doctor.");
            System.out.println(" 3. Delete doctor.");
            System.out.println(" 4. Search doctor.");
            System.out.println(" 5. Exit");
            System.out.print("Enter your choice: ");
            choice = validInfo.takeChoice(); 
            if (choice < 1 && choice > 6) {
                System.err.println("Not in Range");
                choice = validInfo.takeChoice();
            }
            switch (choice) {
                case 1:
                    aDoc();
                    break;

                case 2:
                    upDoc();
                    break;
                case 3:
                    delDoc();
                    break;
                case 4:
                    printDocasTable();
                    searchDoc();
                    break;
                case 5:
                    printOriginalList();
                    break;
                case 6:
                    return;
            }
            System.out.println();
        }
    }
      public ArrayList<Doctor> mynullList(){
        ArrayList<Doctor> myList = dc.print();
        if(myList.isEmpty()){         
            return null;
        }
            
        return myList;
    }
 
    public void aDoc() {
        //---
        System.out.print("Enter Doctor Code:"); //testing doctor code 
        String code = validInfo.validNewInput();
        //---
        if(dc.fCode(code) == true) {
            System.err.println("The code " +code+ " is duplicate"); //if the doctor code is exist out
            return;
        }
        //---
        System.out.print("Enter Doctor Name:"); // Enter doctor name
        String name = validInfo.validNewInput();
        //---
        System.out.print("Enter Doctor Specialization:"); //Enter doctor specializaiton
        String spec = validInfo.validNewInput();
        //---
        System.out.print("Enter Avalability:"); //Enter doctor avaliability
        int a = validInfo.takeChoice();
        //---
        dc.aDoc(new Doctor(code, name, spec, a));// Add the value to the arraylist
        System.err.println("Add sucess");
    }

//    update the information of doctor
    public void upDoc() {
        if(mynullList() == null){ // if the arraylist is null then return
              System.err.println("Database does not exist");
              return;
        }  
        System.out.print("Enter code of doctor you want to update information: ");
        String code = validInfo.validNewInput();
        //---
        if (dc.fCode(code) == false) {
            System.out.print("Doctor code doesn't exist"); // if the code doesnt exist in the current database return to the menu
            return;
        }
        ArrayList<Doctor> myCurrentList = dc.print();
        Doctor d = dc.findByCode(code);         
        String oldCode = d.getCode();
        
        System.out.print("Enter code update:");       
        String newCode = validInfo.updateItem();
        while (true) {
            if (dc.findByCode(newCode) != null) {
                System.err.print("This code is duplicate!!!");
                System.out.print("Enter code update: ");
                newCode = validInfo.checkInputStringEmpty(oldCode);
                d.setCode(null);
            } else {
                break;
            }
        }
        System.out.print("Enter name of d update: ");
        String newName = validInfo.checkInputStringEmpty(d.getName());
        System.out.print("Enter specialization: ");
        String newSpecialization = validInfo.checkInputStringEmpty(d.getSpec());
        System.out.print("Enter availability: ");
        int newAvailability = validInfo.checkInputIntEmpty(d.getA());

        dc.update(d, new Doctor(newCode, newName, newSpecialization, newAvailability));

        System.out.print("Doctor is updated successful!!!");
    }

//   delete doctor by code
    public void delDoc() {
        if(mynullList() == null){ // if the arraylist is null then return
              System.err.println("Database does not exist");
              return;
        }  
        System.out.print("Enter doctor code:");
        String code = validInfo.validNewInput();
        while (true) {
            if (dc.fCode(code) == false) {
                System.err.print("Code is not exist");
                return;
            } else {
                break;
            }
        }
        dc.del(code); //delete the doctor
        System.out.print("Doctor remove");
    }

    public void searchDoc() {   
        if(mynullList() == null){
              System.err.println("Database does not exist");
              return;
        }
        System.out.println("--------------------------");
        System.out.println("Find doctor by");
        System.out.println("1:Code");
        System.out.println("2:Name");
        System.out.println("3:Specialization");
        System.out.println("4:Avalable Doctor");
        System.out.println("--------------------------");
        System.out.print("Enter Your choice:");        
        int choice = validInfo.takeChoice();
        String input = validInfo.validNewInput();
        ArrayList<Doctor> Docsearch = dc.Search(choice, input);
        System.out.println(String.format("%s", "------------------------------"
                + "----------------------------------------------------"));
        System.out.println(String.format("%10s %5s %10s %5s %5s %5s %10s",
                "Doctor Code", "|", "Doctor Name", "|", "Doctor Specilization", "|", "Doctor Avalability"));
        System.out.println(String.format("%s", "------------------------------"
                + "----------------------------------------------------"));
        for (int i = 0; i < Docsearch.size(); i++) {
            System.out.println(String.format("%10s %6.5s %10s %6.5s %10s %15.5s %10s", Docsearch.get(i).getCode(),
                    "|", Docsearch.get(i).getName(), "|", Docsearch.get(i).getSpec(), "|",Docsearch.get(i).getA()));
                       
        }
        System.out.println(String.format("%s", "------------------------------"
                + "----------------------------------------------------"));
        Docsearch.clear();
    }

    public void printDocasTable() {
        System.out.println(String.format("%s", "------------------------------"
                + "----------------------------------------------------"));
        System.out.println(String.format("%10s %5s %10s %5s %5s %5s %10s",
                "Doctor Code", "|", "Doctor Name", "|", "Doctor Specilization", "|", "Doctor Avalability"));
        System.out.println(String.format("%s", "------------------------------"
                + "----------------------------------------------------"));

        for (int i = 0; i < dc.print().size(); i++) {
            System.out.println(String.format("%10s %6.5s %10s %6.5s %10s %15.5s %10s", dc.print().get(i).getCode(),
                    "|", dc.print().get(i).getName(), "|", dc.print().get(i).getSpec(), "|", dc.print().get(i).getA()));

        }
        System.out.println(String.format("%s", "------------------------------"
                + "----------------------------------------------------"));
        System.out.flush();
    }
    
    public void printOriginalList(){
        ArrayList c = dc.print();
        System.out.println(c.toString());
    }
    
}
