package exception;

public class GenderException extends Exception {
    public GenderException(String str){
        super(str);
    }
    public static String genderException(String str) throws GenderException{
       String genderRegex = "^male$|^female$|^unknow$" ;
       str = str.toLowerCase();
       if (str.matches(genderRegex)){
           String temporary = "" + String.valueOf(str.charAt(0)).toUpperCase();
           for (int i = 1; i < str.length(); i++) {
                   temporary += str.charAt(i);
           }
           return temporary;
       }else {
           throw new GenderException("Gender not invalid") ;
       }
    }
}
