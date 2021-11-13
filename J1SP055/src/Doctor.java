/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Doctor {
    String code;
    String name;
    String spec;
    int a;

    public Doctor() {
    }

    public Doctor(String code, String name, String spec, int a) {
        this.code = code;
        this.name = name;
        this.spec = spec;
        this.a = a;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {        
        return  String.format("%10s %6.5s %10s %6.5s %10s %15.5s %10s \n",code,'|',name,'|',spec,'|',a);
    }
}
