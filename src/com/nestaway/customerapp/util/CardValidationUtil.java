package com.nestaway.customerapp.util;

/**
 * Created by shiva on 6/16/2015.
 *
 * Validate Credit Card of below type using Regex and Luhn mod 10 algorithm.
 * //IIN number for card may added or removed.
 * 
 * Source Wikipedia
 */

public class CardValidationUtil {

    public static final int VISA = 0;
    public static final int MASTERCARD = 1;
    public static final int AMEX = 2;
    public static final int DISCOVER = 3;
    public static final int BANKCARD = 4;
    public static final int CHINA_UNION_PAY = 5;
    public static final int MAESTRO = 6;
    public static final int VISA_ELECTRON = 7;
    public static final int JCB = 8;
    public static final int LASER = 9;
    public static final int SWITCH = 10;
    public static final int SOLO = 11;
    public static final int DINERS_CLUB_CARTE_BLANCHE = 12;
    public static final int DINERS_CLUB_ENROUTE = 13;
    public static final int DINERS_CLUB_INTERNATIONAL = 14;
    public static final int DINERS_CLUB_US_CANADA = 15;
    public static final int UATP = 16;
    public static final int DANKORT = 17;

    public static boolean validate(final String credCardNumber) {
        String creditCard = credCardNumber.trim();
        int prefix2 = Integer.parseInt(creditCard.substring(0, 2));
        int prefix6 = Integer.parseInt(creditCard.substring(0, 6));
        int prefix3 = Integer.parseInt(creditCard.substring(0, 3));
        int prefix4 = Integer.parseInt(creditCard.substring(0, 4));
        boolean applyAlgo = false;
                //  case VISA:
                // VISA credit cards has length 13 - 15
                // VISA credit cards starts with prefix 4
        if (creditCard.length() >= 13 && creditCard.length() <= 16
                && creditCard.startsWith("4")) {
            applyAlgo = true;
            System.out.println("VISA" + "\t" + applyAlgo);
        }

            //case MASTERCARD:
            // MASTERCARD has length 16
            // MASTER card starts with 51, 52, 53, 54 or 55
            //Introducing from 14th october 2016 - MASTER card starts with 222100–272099
        else if ((creditCard.length() == 16) && (prefix2 >= 51 && prefix2 <= 55)) {
            applyAlgo = true;
            System.out.println("MASTERCARD" + "\t" + applyAlgo);
        }

            //case AMEX:
            // AMEX has length 15
            // AMEX has prefix 34 or 37
        else if ((creditCard.length() == 15) && (creditCard.startsWith("34") || creditCard
                    .startsWith("37"))) {
            applyAlgo = true;
            System.out.println("AMEX" + "\t" + applyAlgo);
        }

            //case DISCOVER:
            // DISCOVER card has length 16
            // DISCOVER card starts with 6011 or 65 or 622126-622925 or 644 - 649

        else if (creditCard.length() == 16 && ((creditCard.startsWith("6011"))|| creditCard.startsWith("65")
                ||(prefix6 >= 622126 && prefix6 <= 622925) || (prefix3 >= 644 && prefix3 <= 649))) {
            applyAlgo = true;
            System.out.println("DISCOVER" + "\t" + applyAlgo);
        }

            //case BANKCARD :
            //BANKCARD card has length 16
            //BANKCARD card has prefix range 560221 - 560225

        else if (creditCard.length() == 16 && ((creditCard.startsWith("5610"))
                ||(prefix6 >= 560221 && prefix6 <= 560225) )) {
            applyAlgo = true;
            System.out.println("BANKCARD" + "\t" + applyAlgo);
        }

            //case CHINA_UNION_PAY :
            //CHINA_UNION_PAY card has length 16-19
            //CHINA_UNION_PAY card has prefix range 622126-622925 or 624000-626999 or 628200-628899

        else if ((creditCard.length() >= 16 && creditCard.length() <=19)  && (((prefix6 >= 622126 && prefix6 <= 622925)
                    ||(prefix6 >= 624000 && prefix6 <= 626999) || (prefix6 >= 628200 && prefix6 <= 628899)))) {
            applyAlgo = true;
            System.out.println("CHINA_UNION_PAY" + "\t" + applyAlgo);
        }

            //case MAESTRO :
            //MAESTRO card has length 12 - 19
            //MAESTRO card starts with 500000-509999, 560000-699999
        else if (((creditCard.length() >= 12) && (creditCard.length() <= 19)) &&
                ((prefix6 >= 500000 && prefix6 <= 509999) ||(prefix6 >= 560000 && prefix6 <= 699999))) {
            applyAlgo = true;
            System.out.println("MAESTRO" + "\t" + applyAlgo);
        }

            //case VISA_ELECTRON :
            //VISA_ELECTRON card has length 16
            //VISA_ELECTRON card has prefix
        else if (creditCard.length() == 16 && ((creditCard.startsWith("417500"))
                ||(creditCard.startsWith("4917")) || (creditCard.startsWith("4913")) || (creditCard.startsWith("4508"))||
                (creditCard.startsWith("4844")))) {
            applyAlgo = true;
            System.out.println("VISA_ELECTRON" + "\t" + applyAlgo);
        }

            //case JCB :
            //JCB card has length 16
            // JCB card has prefix 3528-3589

        else if ((creditCard.length() ==16)  && (prefix4 >= 3528 && prefix4 <= 3589)) {
            applyAlgo = true;
            System.out.println("JCB" + "\t" + applyAlgo);
        }


            //case LASER :
            //LASER card has length 16-19
            //LASER card has prefix 6304, 6706, 6771, 6709
        else if ((creditCard.length() >= 16 && creditCard.length() <= 19) && ((creditCard.startsWith("6304"))||
                (creditCard.startsWith("6706")) || (creditCard.startsWith("6771")) || (creditCard.startsWith("6709")))) {
            applyAlgo = true;
            System.out.println("LASER" + "\t" + applyAlgo);
        }

            //case SWITCH :
            //SWITCH card has length 16 or 18 or 19
            //SWITCH card has prefix 4903, 4905, 4911, 4936, 564182, 633110, 6333, 6759
        else if (((creditCard.length() == 16) || (creditCard.length() == 18) || (creditCard.length() == 19)) &&
                (creditCard.startsWith("4903") || creditCard.startsWith("4905") || creditCard.startsWith("4936")
                        || creditCard.startsWith("564182") || creditCard.startsWith("633110") || creditCard.startsWith("6333")
                        || creditCard.startsWith("6759"))) {
            applyAlgo = true;
            System.out.println("SWITCH" + "\t" + applyAlgo);
            
        }

            //case SOLO :
            //SOLO card has length 16 or 18 or 19
            //SOLO card has prefix 6334, 6767
        else if (((creditCard.length() == 16) || (creditCard.length() == 18) || (creditCard.length() == 19)) &&
                (creditCard.startsWith("6334") || creditCard.startsWith("6767"))) {
            applyAlgo = true;
            System.out.println("SOLO" + "\t" + applyAlgo);
        }


            //case DINERS_CLUB_CARTE_BLANCHE :
            //DINERS_CLUB_CARTE_BLANCHE card has length 14
            //DINERS_CLUB_CARTE_BLANCHE card has prefix 300-305
        else if ((creditCard.length() ==14)  && (prefix3 >= 300 && prefix3 <= 305)) {
            applyAlgo = true;
            System.out.println("DINERS_CLUB_CARTE_BLANCHE" + "\t" + applyAlgo);
        }

            //case DINERS_CLUB_ENROUTE :
            //DINERS_CLUB_ENROUTE card has length 15
            //DINERS_CLUB_ENROUTE card has prefix 2014, 2149

        else if ((creditCard.length() == 15) &&
                (creditCard.startsWith("2014") || creditCard.startsWith("2149"))) {
            applyAlgo = true;
            System.out.println("DINERS_CLUB_ENROUTE" + "\t" + applyAlgo);
        }

            //case DINERS_CLUB_INTERNATIONAL :
            //DINERS_CLUB_INTERNATIONAL card has length 14
            //DINERS_CLUB_INTERNATIONAL card has prefix 36
        else if ((creditCard.length() == 14) &&
                (creditCard.startsWith("36")) || (creditCard.startsWith("38")) ||(creditCard.startsWith("38"))||
                (creditCard.startsWith("309"))) {
            applyAlgo = true;
            System.out.println("DINERS_CLUB_INTERNATIONAL" + "\t" + applyAlgo);
        }

            //case DINERS_CLUB_US_CANADA :
            //DINERS_CLUB_US_CANADA has length 16
            //DINERS_CLUB_US_CANADA has prefix 54, 55
        else if ((creditCard.length() == 16) && (creditCard.startsWith("54"))||(creditCard.startsWith("55"))) {
            applyAlgo = true;
            System.out.println("DINERS_CLUB_US_CANADA" + "\t" + applyAlgo);
        } 
        
            //case UATP :
            //UATP has length 15
            //UATP has prefix 1
        else if (creditCard.length() == 15 && creditCard.startsWith("1")) {
            applyAlgo = true;
            System.out.println("UATP" + "\t" + applyAlgo);
        }

         
            //case DANKORT :
            // DANKORT has length  16
            //DANKORT has prefix 5019
        else if (creditCard.length() == 16 && creditCard.startsWith("5019")) {
            applyAlgo = true;
            System.out.println("DANKORT" + "\t" + applyAlgo);
        }

        
        return (applyAlgo && validateLuhn(creditCard));
    }

    public static boolean validateLuhn(String card) {
        //LUHN algorithm is a Modulo based algorithm. It calculate MOD(10)
        //LUHN algorithm catches the minor mistakes in typing the card number.
        /*
            Reverse the digits: 61789372994
            calculate Sum of the odd digits: 6 + 7 + 9 + 7 + 9 + 4 = 42 = s1
            The even digits: 1,  8,  3,  2,  9
            Two times the each even digits: 2, 16,  6,  4, 18
            Sum the digits of each multiplication: 2,  7,  6,  4,  9
            Sum the last: 2 + 7 + 6 + 4 + 9 = 28 = s2
            if ((s1+s2)%10 == 0)
                true;
            else
                false;
            s1 + s2 = 70 and 70%10 == 0 which ends in zero which means that 49927398716 passes the Luhn test
         */
        int sum = 0;
        int length = card.length();
        for (int index = 0; index < card.length(); index++) {
            if ((index % 2) == 0) {
                sum += card.charAt(length - index - 1) - '0';
            } else {
                sum += sumOfDigits((card.charAt(length - index - 1) - '0') * 2);
            }
        }
        return ((sum % 10)== 0);
    }
    private static int sumOfDigits(int number) {
        return (number % 10) + (number / 10);
    }

}
