package convert;
// Class:           Value
// 
// Type:            Abstract
// 
// Description:     This class contains the biolerplate that all child objects share
// 
// Methods:         getValue()      returns current value.
//                  getLocale()     returns current locale.
//                  setValue()      set current value.
//                  setLocale()     set current locale.
//                  convert()       convert imperial to metric & vice-versa. Implemented in children.
public abstract class Value {
    protected float v;
    protected String l;
    // default constructor
    Value (){
        setValue(0.0f);
        setLocale("");
    }
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
    abstract void convert();
}
