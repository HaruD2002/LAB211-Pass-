/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsp0057;

import java.io.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Controller {
    private final Scanner sc = new Scanner(System.in);
    //Create a file if the file not exist
    
    public void createUser(getUser d) throws Exception{   
        
        File f = new File("User.dat");
        if(!f.exists()){
            f.createNewFile();
        }
        FileWriter fw = new FileWriter(f,true);
        fw.write(d.Uname+"/"+d.pass+"\n");
        fw.close();
    }
   
    public String findPass(String d) throws Exception{
        File f = new File("User.dat");        
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
            while ((line = br.readLine()) != null) {
                String[] User = line.split("/");
                if (d.equalsIgnoreCase(User[0])){
                    return User[1];       
                }           
            }
            br.close();
            fr.close();
       
            return null;
    }
    public boolean Uname(String s) throws Exception{
            File f = new File("User.dat");
               
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line =  br.readLine()) != null) {
                String[] account = line.split("/");
                if (s.equalsIgnoreCase(account[0])) {
                    return false;
                }
            }
            br.close();
            fr.close();
            return true;
     
    }

    

    
    

   
}
