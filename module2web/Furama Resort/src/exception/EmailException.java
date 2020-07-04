package exception;

public class EmailException extends Exception {
    public EmailException (String str){
        super(str);
    }
    public static String emaiException(String email)throws EmailException{
        String regex ="^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (email.matches(regex)){
            return email ;
        }else {
            throw new EmailException("Email not invalid");
        }
    }
}
