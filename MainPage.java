import java.util.Scanner;
import loginPage.*;

public class MainPage {
    private Scanner sc = new Scanner(System.in);

    public boolean loginChoice(String loginOption){
        switch( loginOption.toLowerCase() ) {
            case "admin":
                AdminLogin adminLogin = AdminLogin.getInstance();
                break;

            case "student":

                break;

            default:
                System.out.println("Invalid choice :- please choose any one below");
                return true;
        }
        return false;
    }

    public void show(){
        System.out.println(" * To Login  --> login \n * To signup --> signup\n");
        String option = sc.nextLine();

        switch( option.toLowerCase() ){
            case "login" :
                System.out.println("*** Login page ***");
                do {
                    System.out.println(" * For Admin Login   --> admin \n * For Student Login --> Student \n");
                }while( this.loginChoice(sc.nextLine()) );
                break;

            case "signup" :
                System.out.println("*** signup page ***");
                break;
            default:
                System.out.println("Invalid choice :- please choose any one below");
                this.show();
        }
    }
}
