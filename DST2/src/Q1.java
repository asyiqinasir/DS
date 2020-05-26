/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdminSC
 */
public class Q1 {

    public static <K, V> void compare(K a, V b) {
        if (a instanceof String) {
            if (a.equals(b)) {
                System.out.println("The String is equal");
            } else {
                System.out.println("The String is not equal");
            }
        } else if (a instanceof Integer) {
            if (b instanceof Integer){
                System.out.println("The sum of the Integer is " + ((Integer)a + (Integer)b));
            }}
        else if (a instanceof Double){
            if (b instanceof Double){
                System.out.println("The sum of the double is " +((Double)a + (Double)b));               
            }
                
                
                
                
        }
        

    }

}


