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
public class Weight extends Value {
    Weight(){
        setValue(0.0f);
        setLocale("");
    }
    Weight(String value, String locale){
        setValue(value);
        setLocale(locale);
    }
    Weight(float value, String locale){
        setValue(value);
        setLocale(locale);
    }
    @Override
    void convert(String option){
        float currentValue = getValue();
        
        if (null != option.toLowerCase()){
            switch (option.toLowerCase()){
                case "i":{
                    // convert grams to ounces
                    float newValue = currentValue * 0.035274f;
                    setValue(newValue);
                        break;
                    }
                case "m":{
                    // convert ounces to grams
                    float newValue = currentValue / 0.035274f;
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
