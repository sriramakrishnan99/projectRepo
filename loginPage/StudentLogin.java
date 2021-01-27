package loginPage;

import java.util.Scanner;

public class StudentLogin {
    private static Scanner sc = new Scanner(System.in);

    public String getInput(String promptMessage){
        System.out.printf( "%S : ", promptMessage );
        return sc.nextLine();
    }

    public void registration(){
        System.out.println(" * mandatory fields ");
        String name = this.getInput("* name");
        String rollNumber = this.getInput("* rollNumber");
        String emailId    = this.getInput("* Email Id");
    }

    public void showProfile(){

    }

    public void edit(){

    }
}