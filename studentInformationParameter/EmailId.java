package studentInformationParameter;
import java.util.regex.*;

public class EmailId{
    private String emailId;

    public String getEmailId() {
        return emailId;
    }

    public boolean setEmailId(String emailId) {
        System.out.println("");
        if( this.isValid(emailId) ) {
            this.emailId = emailId;
            return true;
        }
        else{
            System.out.println(" Invalid Email Id \n"+
                               " Email Id should be of form - personal_info@domain \n"+
                               " for eg: jsmith66@gmail.com ");
            return false;
        }
    }

    public static boolean isValid(String emailId){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }
}