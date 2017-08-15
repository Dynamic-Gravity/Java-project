// Class:           Length
// 
// Type:            Public
// 
// Description:     This class contains the logic for weights.
// 
// Methods:         convert()       converts meters to feet & vice-versa.
public class Length extends Value {
    public Length(String value, String locale){
        super();
        super.setValue(value);
        super.setLocale(locale);
    }
    public Length(float value, String locale){
        super();
        super.setValue(value);
        super.setLocale(locale);
    }
    void convert(String option){
        float currentValue = getValue();
        // convert metric to imperial
        if (option.toLowerCase() == "i"){
            // convert meters to feet
            float newValue = currentValue * 3.2808f;
            super.setValue(newValue);
        }
        // convert imperial to metric
        else if (option.toLowerCase() == "m"){
            // convert feet to meters
            float newValue = currentValue / 3.2808f;
            super.setValue(newValue);
        } else {
            System.out.println("Invalid option");
        }
    }    
}