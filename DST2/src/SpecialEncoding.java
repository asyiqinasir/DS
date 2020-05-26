/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdminSC
 */
public class SpecialEncoding<T> {

    private T[] t;
    private String command;

    public SpecialEncoding(T[] t) {
        this.t = t;
        this.command = command;
    }

    public String encoding() {
        String str =" ";
        if (t instanceof Integer[]) {
            for (int i = 0; i < t.length; i++) {
                switch ((Integer) t[i]) {
                    case 0:
                        str = str + " Copy ";
                        break;
                    case 1:
                        str = str + " Delete ";
                        break;
                    case 2:
                        str = str + " Insert ";
                        break;
                    case 3:
                        str = str + " Print ";
                        break;
                    case 4:
                        str = str + " Rename ";
                        break;
                    case 5:
                        str = str + " Paste ";
                        break;
                }
            }

        } else if (t instanceof Character[]) {
            for (int i = 0; i < t.length; i++) {
                switch ((Character) t[i]) {
                    case 'C':
                        str = str + " Copy ";
                        break;
                    case 'D':
                        str = str + " Delete ";
                        break;
                    case 'I':
                        str = str + " Insert ";
                        break;
                    case 'P':
                        str = str + " Print ";
                        break;
                    case 'R':
                        str = str + " Rename ";
                        break;
                    case 'V':
                        str = str + " Paste ";
                        break;

                }
            }
        }

        return str;
    }

    public String toString() {
        String str = " ";
        str = "The code is" + str ;
        for (int i = 0; i < t.length; i++) {
            str = str + t[i] + " ";
        }
            str = str + "\nThe Command is"  + encoding();
        
        
        return str;
    }

}
