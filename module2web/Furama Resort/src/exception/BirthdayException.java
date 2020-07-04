package exception;

import java.time.LocalDate;

public class BirthdayException extends Exception {
    public BirthdayException(String str) {
        super(str);
    }

    public static String birthdayException(String birthday) throws BirthdayException {
        String regexBirthday = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
        LocalDate date = LocalDate.now();
        if (birthday.matches(regexBirthday)) {
            String temp = "";
            for (int i = birthday.length() - 4; i < birthday.length(); i++) {
                temp += birthday.charAt(i);
            }
            Integer year = new Integer((temp));
            if (date.getYear() - year > 18 && year > 1900) {
                return birthday;
            } else {
                throw new BirthdayException("Năm sinh phải > 1900 và nhỏ hơn năm hiện tại 18 năm");
            }
        } else {
            throw new BirthdayException("Birthday is not invalid");
        }

    }
}
