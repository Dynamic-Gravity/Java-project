/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myconvertapp;

/**
 *
 * @author Dynamic-Gravity
 */
public abstract class Value {
    protected float v;
    protected String l;
    
    public void setValue(float value){
        // put value into protected instance variable
        v = value;
    }
    public void setValue(String value){
        // put value into protected instance variable
        v = Float.parseFloat(value);
    }
    public void setLocale(String locale){
        // put locale into protected instance variable
        l = locale;
    }
    public float getValue(){
        return v;
    }
    public String getLocale(){
        return l;
    }
    abstract void convert(String s);
}
