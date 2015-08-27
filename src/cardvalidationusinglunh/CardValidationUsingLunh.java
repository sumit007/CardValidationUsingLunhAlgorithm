/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardvalidationusinglunh;

import GeneralJavaCodes.Code_1;
import com.nestaway.customerapp.util.CardValidationUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shiva
 */


class A {
    A() {
        System.out.println("sumit");
        new A();
    }
    
}
public class CardValidationUsingLunh {

    /**
     * @param args the command line arguments
     */
    
    public static boolean validateOnlyAlphabet(String value) {
        String ALPHABET_ONLY_PATTERN_WITH_DOT = "^[a-zA-Z. ]+$";
        Pattern pattern = Pattern.compile(ALPHABET_ONLY_PATTERN_WITH_DOT);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();

    }
    
    public static void main(String[] args) {
        
        
        //System.out.println(validateOnlyAlphabet(".maduraicant."));
       // A a = new A();
        
        String[] cardsArray = {"6011111111111117",
        "6011000990139424","3530111333300000","3566002020360505","5555555555554444",
        "5105105105105100","4111111111111111","4012888888881881","4222222222222",
        "586824160825533338","6759411100000008","5555555555554444","6759411100000008"};
        for (int i = 0; i < cardsArray.length; i++) {
            boolean cardValidity = CardValidationUtil.validate(cardsArray[i]);
            System.out.println(cardsArray[i] + "\t" +cardValidity);
            System.out.println();
        }
        int[] intArray;
        intArray = Code_1.fibbonaci_dynamic(9);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    
}
