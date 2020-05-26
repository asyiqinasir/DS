/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;

/**
 *
 * @author AdminSC
 */
public class ArrayDice<T extends Number> implements Dice<T> {

    private int rollNumber;
    private int sum;
    private T[] rollValue ;

    public ArrayDice(int rollNumber) {
        this.rollNumber = rollNumber;
        this.rollValue = (T[]) new Number[rollNumber];
        diceNumber();

    }

    public void diceNumber() {
        Random r = new Random();
        for (int i = 0; i < rollNumber; i++) {
            Integer num = r.nextInt(6) + 1;
            rollValue[i] = (T) num;
        }
    }

    @Override
    public String toString() {
        diceNumber();
        String statement = "Array Implementation: Roll " + rollNumber + " time(s)\n";
        for (int i = 0; i < rollValue.length; i++) {
            statement += rollValue[i] + " ";
            if (rollValue[i].getClass() == Integer.class) {
                sum += rollValue[i].intValue();
            } else {
                sum += rollValue[i].doubleValue();
            }
        }
        statement += "\nTotal is " + sum;
        return statement;
    }

}
