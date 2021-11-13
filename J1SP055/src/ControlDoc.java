
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ControlDoc {
     private final ArrayList<Doctor> doc = new ArrayList<>();
    private final ArrayList<Doctor> a = new ArrayList<>();
    public ArrayList<Doctor> print() {
        return doc;
    }
    
    public ArrayList<Doctor> printnewList(){
        return a;
    }
    

    public void aDoc(Doctor d) {
        doc.add(d);
        return;
    }

    //toi uu code 
    //tim cap nhat luon 
    public void update(Doctor d, Doctor nd) {    
        for (int i = 0; i < doc.size(); i++) {
             if(d.getCode() == doc.get(i).getCode()){
                 doc.set(i, nd);
                 return;
             }
        }
    }
// ket thuc ham sau khi xoa

    public void del(String s) {
        for (int i = 0; i < doc.size(); i++) {
            if (s.equalsIgnoreCase(doc.get(i).getCode())) {
                doc.remove(i);
                return;
            }
        }

    }

    //tra ve tat ca bac si thoa man yeu cau tim kiem 
    public ArrayList<Doctor> Search(int choice, String s) {       
        Iterator<Doctor> iterator = doc.iterator();
        s = s.toLowerCase();
        while (iterator.hasNext()) {
            Doctor d = iterator.next();
            switch (choice) {
                case 1:
                    if (d.getCode().toLowerCase().contains(s)){
                        a.add(d);
                    }
                    break;
                case 2:
                    if (d.getName().toLowerCase().contains(s)) {
                        a.add(d);
                    }
                    break;
                case 3:
                    if (d.getSpec().toLowerCase().contains(s)) {
                        a.add(d);
                    }
                    break;
                default:
                    return doc;
            }
        }
        for (Doctor a1 : a) {
            return a;
        }
        return a;
    }

    public boolean fCode(String s) {

        for (int i = 0; i < doc.size(); i++) {
            while(s.equalsIgnoreCase(doc.get(i).getCode())) {
                return true;
            }           
        }
        return false;
    }

    public Doctor findByCode(String code){
        for (int i = 0; i < doc.size(); i++) {
            if(code.equalsIgnoreCase(doc.get(i).getCode())){
               
                return doc.get(i);
            } 
        }
        return null;
    }
    
}
