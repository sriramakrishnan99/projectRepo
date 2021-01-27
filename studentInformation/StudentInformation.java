package studentInformation;

import studentInformationParameter.*;

import java.util.HashMap;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentInformation {
    private String name ;
    private long rollNumber ;
    private Calendar dateOfBrith;
    private String gender;
    private EmailId emailId = new EmailId();
    private String password;
    private HashMap< String, AddressField> addressList ;
    private HashMap< String, PhoneNumber > phoneNumberlist ;


    public StudentInformation(String name,
                              long rollNumber,
                              String dateOfBrith,
                              String gender,
                              String emailId,
                              String password){
        this.setName(name);
        this.setRollNumber(rollNumber);
        this.setGender(gender);
        this.setEmailId(emailId);
        this.setPassword(password);
        String[] calenderFields = dateOfBrith.split("\\D");
        this.dateOfBrith = new GregorianCalendar( Integer.parseInt( calenderFields[2] ) ,
                                                  Integer.parseInt( calenderFields[1] ) ,
                                                  Integer.parseInt( calenderFields[0] ) );
    }

    public String getDateOfBrith() {
        return String.format( "%02d-%02d-%4d"                      ,
                              this.dateOfBrith.get(Calendar.DATE)  ,
                              this.dateOfBrith.get(Calendar.MONTH) ,
                              this.dateOfBrith.get(Calendar.YEAR)  );
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getEmailId() {
        return emailId.getEmailId();
    }

    public void setEmailId(String emailId){
        this.emailId.setEmailId(emailId);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HashMap<String, AddressField> getAddressList() {
        return addressList;
    }

    public void setAddressList(HashMap<String, AddressField> addressList) {
        this.addressList = addressList;
    }

    public HashMap<String, PhoneNumber> getPhoneNumberlist() {
        return phoneNumberlist;
    }

    public void setPhoneNumberlist(HashMap<String, PhoneNumber> phoneNumberlist) {
        this.phoneNumberlist = phoneNumberlist;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
