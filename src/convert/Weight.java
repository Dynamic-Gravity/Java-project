// Class:           Weight
// 
// Type:            Public
// 
// Description:     This class contains the logic for weights.
// 
// Methods:         convert()       converts grams to ounces & vice-versa.               
public class Weight extends Value {
    public Weight(String value, String locale){
        super();
        super.setValue(value);
        super.setLocale(locale);
    }
    public Weight(float value, String locale){
        super();
        super.setValue(value);
        super.setLocale(locale);
    }
    void convert(String option){
        float currentValue = getValue();
        // convert metric to imperial
        if (option.toLowerCase() == "i"){
            // convert grams to ounces
            float newValue = currentValue * 0.035274f;
            super.setValue(newValue);
        }
        // convert imperial to metric
        else if (option.toLowerCase() == "m"){
            // convert ounces to grams
            float newValue = currentValue / 0.035274f;
            super.setValue(newValue);
        } else {
            System.out.println("Invalid option");
        }
    }    
}