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

    public static void writeLine(char c, int n) {
        if (n == 0) {
            System.out.println(" ");
        } else {
            writeLine(c, n - 1);
            System.out.print(c);
        }
    }

    public static void writeBlock(char c, int n, int m) {
        if( m==0){            
            System.out.println(" ");
        }else{
            writeLine(c, n);
            writeBlock(c,n,m-1);
            
        }

    }

}
