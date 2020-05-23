package exception;

public class NameException extends Exception{
    public NameException(String str){
        super (str) ;
    }
    public static String nameException(String name) throws NameException{
        String regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$" ;
        if (name.matches(regex)){
            return name ;
        }else {
            throw new NameException("Tên phải in hoa chữ đầu tiên trong mỗi từ") ;
        }
    }
}

