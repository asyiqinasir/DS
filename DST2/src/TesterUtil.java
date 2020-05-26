/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdminSC
 */
public class TesterUtil {
    public static void main(String[] args) {
        String a="Hello", b="World";
        System.out.println("The parameters value are : " + a + " and " + b);
        Util.compare(a, b);
    
        Double c=12.4, d=64.3;
        System.out.println("The parameters value are : " + c + " and " +d);
        Util.compare (c, d);
        
        Integer e=20, f=35;
        System.out.println("The parameters value are : " + e + " and " +f);
}
}
