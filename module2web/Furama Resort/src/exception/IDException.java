package exception;

public class IDException extends Exception {
    public IDException (String str){
        super(str);
    }
    public static String idException(String id) throws IDException{
        String idRegex = "^\\d{3}\\s\\d{3}\\s\\d{3}$" ;
        if (id.matches(idRegex)){
            return id ;
        }else {
            throw  new IDException("ID:XXX XXX XXX") ;
        }
    }
}
