/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdminSC
 */
public class TesterQ4Exception {
    public static void main(String[] args){
        String s = "Testing purpose only";
        
        try{
            if(s.length()>12){
                throw new Q4Exception():
            }
        }
        catch(Q4Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
