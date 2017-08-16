/**
 * MyConvertApp
 * Copyright (C) 2017  Dynamic-Gravity
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
