
import java.util.LinkedList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AdminSC
 */
public class LinkedListDice<T> {

    private int rollNumber;
    private int sum;
    private LinkedList<T> rollValue;
    private LinkedList<T> diceNumber;

    public LinkedListDice(int rollNumber) {
        this.rollNumber = rollNumber;
        this.diceNumber = diceNumber;
        this.rollValue = new LinkedList<>();
    }

    public void diceNumber() {
        Random r = new Random();
        for (int i = 0; i < rollNumber; i++) {
            rollValue.add(diceNumber.get(r.nextInt(diceNumber.size())));
        }
    }

    @Override
    public String toString() {
        diceNumber();
        String statement = "Linked List Implementation: Roll " + rollNumber + " time(s)\n";
        for (int i = 0; i < rollValue.size(); i++) {
            statement += rollValue.get(i) + " ";
            if (rollValue.get(i).getClass() == Integer.class) {
                sum += rollValue.get(i).intValue();
            } else {
                sum += rollValue.get(i).doubleValue();
            }

        }
        statement += "\nTotal is " + sum;
        return statement;

    }
}
