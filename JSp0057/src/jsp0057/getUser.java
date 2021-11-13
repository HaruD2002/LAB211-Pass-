/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsp0057;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class getUser implements Serializable{
    String Uname;
    String pass;

    public getUser() {
    }

    public getUser(String Uname, String pass) {
        this.Uname = Uname;
        this.pass = pass;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Uname:" + Uname + ", pass:" + pass + '}';
    }
    
    
    
}
