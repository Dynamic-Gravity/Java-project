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
