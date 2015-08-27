/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralJavaCodes;

/**
 *
 * Recursive Implementation of Fibonacci series in java 
 * 
 * @author shiva
 */
public class Code_1 {
    
    public static int fibbonaci_recur(int num) {
        if (num < 2) {
            System.out.println(num);
            return num;
        }
        
        int sum = fibbonaci_recur(num-1) + fibbonaci_recur(num-2);
        System.out.println(sum);
        return sum;
    }
    
    public static int[] fibbonaci_dynamic(int num) {
        int [] intArray = new int[num];
        intArray[0] = 0;
        intArray[1] = 1;
        for (int i = 2; i < num; i++) {
            intArray[i] = intArray[i-1]+intArray[i-2];
        }
        return intArray;
    }
}
