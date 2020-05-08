package ngonngulaptrinhjava.baitap;

import java.util.Scanner;

public class readNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(read0To999(number));
    }

    public static String readOneDigit(int digit) {
        if (digit < 0 || digit > 10) {
            System.out.println("out of ability");
            return " ";
        }
        switch (digit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }

    }

    public static String read10To19(int num) {
        if (num < 10 || num > 19) {
            System.out.println("out of ability");
            return "";
        }
        int lastDigit = num % 10;
        switch (lastDigit) {
            case 0:
                return "ten";
            case 1:
                return "eleven";
            case 2:
                return "twelve";
            case 3:
                return "thirdteen";
            case 4:
                return "fourteen";
            case 5:
                return "fifteen";
            case 6:
            case 7:
            case 8:
            case 9:
                return readOneDigit(lastDigit) + "teen";
            default:
                return "";
        }
    }

    public static String read20To99(int num) {
        if (num < 20 || num > 99) {
            System.out.println("out of ability");
            return "";
        }
        int tens = num / 10;
        int ones = num % 10;
        switch (tens) {
            case 2:
                if (ones == 0) {
                    return "twenty";
                }
                return "twenty-" + readOneDigit(ones);
            case 3:
                if (ones == 0) {
                    return "thirty";
                }
                return "thirty-" + readOneDigit(ones);
            case 4:
                if (ones == 0) {
                    return "forty";
                }
                return "forty-" + readOneDigit(ones);
            case 5:
                if (ones == 0) {
                    return "fifty";
                }
                return "fifty-" + readOneDigit(ones);
            case 6:
                if (ones == 0) {
                    return "sixty";
                }
                return "sixty-" + readOneDigit(ones);
            case 7:
                if (ones == 0) {
                    return "seventy";
                }
                return "seventy-" + readOneDigit(ones);
            case 8:
                if (ones == 0) {
                    return "eighty";
                }
                return "eighty-" + readOneDigit(ones);
            case 9:
                if (ones == 0) {
                    return "ninety";
                }
                return "ninety-" + readOneDigit(ones);
            default:
                return "";
        }
    }

    public static String read0To99(int num) {
        if (num >= 0 && num < 10) {
            return readOneDigit(num);
        } else if (num < 20) {
            return read10To19(num);
        } else if (num < 100) {
            return read20To99(num);
        } else {
            System.out.println("out of ability");
            return "";
        }
    }

    public static String read100To999(int num) {
        int hundreds = num / 100;
        int tens = num % 100 / 10;
        int ones = num % 10;
        switch (hundreds){
            case 1:

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (tens == 0 && ones == 0) {
                    return readOneDigit(hundreds) + " hundreds";
                }
                return readOneDigit(hundreds) + " hundreds " + read0To99(num % 100);
            default:
                return "";
        }
    }
    public static String read0To999(int num ){
        if (num >=10 && num <100){
            return read0To99(num) ;
        }else if (num <1000){
            return read100To999(num) ;
        }else {
            System.out.println("out of ability");
            return "" ;
        }
    }
}
