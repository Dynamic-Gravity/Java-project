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
public class Length extends Value {
    Length(){
        setValue(0.0f);
        setLocale("");
    }
    Length(String value, String locale){
        setValue(value);
        setLocale(locale);
    }
    Length(float value, String locale){
        setValue(value);
        setLocale(locale);
    }
    @Override
    void convert(String option){
        float currentValue = getValue();
        
        if (null != option.toLowerCase()){
            switch (option.toLowerCase()){
                case "i":{
                    // convert meters to feet
                    float newValue = currentValue * 3.2808f;
                    setValue(newValue);
                        break;
                    }
                case "m":{
                    // convert feet to meters
                    float newValue = currentValue / 3.2808f;
                    setValue(newValue);
                        break;
                    }
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    } 
}
