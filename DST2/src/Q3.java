/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdminSC
 */
public class Q3 {

    public static void main(String[] args) {
        int a = 42, b = 15, c = 58;
        System.out.println("The maximum value of " + a + " " + b + " " + c + " is " + getMax(a, b, c));
        double d = 12.45, e = 41.28, f = 19.82;
        System.out.println("The maximum value of " + d + " " + e + " " + f + " is " + getMax(d, e, f));

    }

    public static <T extends Comparable> T getMax(T a, T b, T c) {
        T d;
        if (a.compareTo(b) > 0) {
            d = a;
        } else {
            d = b;
        }
        if (c.compareTo(d) > 0) {
            d = c;
            
        }
        return d;

    }

}
