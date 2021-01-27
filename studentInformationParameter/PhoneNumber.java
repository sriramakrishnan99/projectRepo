package studentInformationParameter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private String number;

    public PhoneNumber( String number ){
        this.setNumber(number);
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        if(this.validate(number)) {
            this.number = number;
        }
        else {
            System.out.println("Invalid phone number format");
        }
    }

    public boolean validate(String number){
        Pattern pattern = Pattern.compile("[0-9]{10,10}");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

}
