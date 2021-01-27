package loginPage;

import studentInformation.*;
import studentInformationParameter.EmailId;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AdminLogin {

    private Scanner sc = new Scanner(System.in);
    private static AdminLogin instance = null;

    public static AdminLogin getInstance(){
        return instance != null ? instance : (instance = new AdminLogin());
    }

    private AdminLogin(){

    }

    public String getInput(String promptMessage){
        System.out.printf( "%S : ", promptMessage );
        return sc.nextLine();
    }

    public void registration(){
        System.out.println(" ( * ) indicate it is a mandatory field ");
        String name         = this.getInput("* name");
        String rollNumber   = this.getInput("* Employee Id");
        String emailId      = this.getInput("* Email Id");
        String password     = this.getInput("* password");
        String mobileNumber = this.getInput("* Mobile number");
    }

    public void showProfile(){

    }

    public void update() throws IOException, ClassNotFoundException, FileNotFoundException {
        System.out.println("Enter the roll number of the student to whom you want to update the details");

        StudentsData studentsData = new StudentsData("StudentsData.txt");
        StudentInformation studentInfo = studentsData.getStudentData( sc.nextLong() );



        this.updateChoice(studentInfo);
    }

    private void updateChoice(StudentInformation studentInfo) {
        System.out.println("Choose the one which you want to update from the below list\n" +
                "Student name\n"+
                "roll number\n"+
                "Email Id\n"+
                "password\n"+
                "date of brith\n"+
                "phone number\n"+
                "Address\n"+
                "gender");
        String option = sc.nextLine();
        boolean status = false;

        do{
            switch ( option.toLowerCase() ) {
                case "student name":
                    studentInfo.setName(getInput("Enter new name of the student"));
                    break;
                case "roll number":
                    long rollNumber = Long.parseLong(getInput("Enter new name roll number"));
                    studentInfo.setRollNumber(rollNumber);
                    break;
                case "email id":
                    String emailId = getInput("Enter new email id");
                    if (EmailId.isValid(emailId)) {
                        studentInfo.setEmailId(emailId);
                        break;
                    }
                    else {
                        status = true;
                    }
                    break;
                default:
                    System.out.println("Invalid choice , Please choose any one listed below ");
                    this.updateChoice(studentInfo);
                    break;
            }
        }while(true);

    }
}
