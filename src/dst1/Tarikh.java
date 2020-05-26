/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1;

/**
 *
 * @author AdminSC
 */
public class Tarikh {

    private int day, month, year;

    public Tarikh(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    @Override
    public String toString() {

        String str = "Date is : ";
        if (day < 10) {
            str = str + "0";
            str = str + day + "/";
        
        if (month < 10) 
            str = str + "0";
            str = str + month + "/" + year ;

        }
        return "Day:" + day + " Month:"+ month+ " Year:"+ year + "\n" + str ;

    }
}
