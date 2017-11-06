
public class Patron {

    static public double lateFee;
    static boolean isOverdue = false;
    String username;
    String password;

    public boolean checkPassword(String pass) {
        if (pass.equals(password)) {
            return true;
        } else {
            return false;
        }//end if
    }//end checkPassword

    public String getUsername() {
        return username;
    }//end getUsername

}//end class
