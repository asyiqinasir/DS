/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdminSC
 */
//Question 1
public class Util {
    
    public static <K,V> void compare(K a, V b){ //can also public static <K> void compare(K a, K b) #checkitoutwillya
        if (a instanceof Integer) {
            System.out.println("The sum of the integer is : " + ((Integer)a + (Integer) b)); //casting is used. convert a to integer and b also to integer
        }
        else if (a instanceof Double) {
            System.out.println("The sum of the double is : " + ((Double)a + (Double) b));
        }
        else if (a instanceof String) {
            if ( a.equals(b)) { //compare String using .equals()
                System.out.println("The string is equal");
            }
            else {
                System.out.println("The string is not equal");
            }
        }
    }
}

//tester class
  
