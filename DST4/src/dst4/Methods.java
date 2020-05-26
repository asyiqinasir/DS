/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst4;

/**
 *
 * @author AdminSC
 */
public class Methods {

    //1
    public static void Q1() {
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.addNode(23.1);
        linkedList.addNode(36.5);
        linkedList.addNode(12.8);
        linkedList.addNode(42.6);
        linkedList.addNode(32.8);
        System.out.println("The number in the linked list");
        linkedList.showList();
    }

    //2
    public static void Q2() {
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.addNode(23.1);
        linkedList.addNode(36.5);
        linkedList.addNode(12.8);
        linkedList.addNode(42.6);
        linkedList.addNode(32.8);
        System.out.println("The number in the linked list after updated");
        linkedList.addTenPointFive();
        linkedList.showList();
    }

    //3
    public static void Q3() {
        countCurrency(1468);
    }

    public static void countCurrency(int amount) {
        System.out.println("\n");
        LinkedList<Integer> currencyNotes = new LinkedList<>();
        LinkedList<Integer> numberOfNotes = new LinkedList<>();

        currencyNotes.addNode(100);
        currencyNotes.addNode(50);
        currencyNotes.addNode(20);
        currencyNotes.addNode(10);
        currencyNotes.addNode(5);
        currencyNotes.addNode(1);

        for (int i = 0; i < currencyNotes.length(); i++) // this is to show numberofnotes
        {
            numberOfNotes.addNode(0);   // set all to 0 first
        }
        int remainder = amount;    // *
        for (int i = 0; i < currencyNotes.length(); i++) {
            int note = currencyNotes.get(i);
            if (remainder > note) {
                numberOfNotes.set(i, remainder / note);
                remainder = amount % note;
            }
        }

        for (int i = 0; i < currencyNotes.length(); i++) {
            System.out.println("MYR " + currencyNotes.get(i) + " : " + numberOfNotes.get(i));
        }

    }

    //4
    //4a & 4b are in LinkedList.java tab
    //4c
    public static void Q4() {
        System.out.println("\n");
        LinkedList<Integer> sumAndEven = new LinkedList<>();
        sumAndEven.addNode(23);
        sumAndEven.addNode(15);
        sumAndEven.addNode(17);
        sumAndEven.addNode(28);
        sumAndEven.addNode(12);
        sumAndEven.addNode(40);
        sumAndEven.showList();

        System.out.println("Linked List has " + sumAndEven.length() + " node(s)");
        System.out.println("Total is " + sumAndEven.getSumOfInteger());
        System.out.println("Total even number is " + sumAndEven.getTotalEvenNumber());

    }

    //5
    //5a & 5b are in LinkedList.java tab
    //5c
    public static void Q5() {
        System.out.println("\n");
        LinkedList<Integer> randomAndDelete = new LinkedList<>();

        for (int i = 0; i < 15; i++) {
            randomAndDelete.addRandom(0, 15);
        }
        System.out.println("Linked List has " + randomAndDelete.length() + " node(s)");
        randomAndDelete.showList();

        randomAndDelete.removeAll(4);
        System.out.println("Linked List has " + randomAndDelete.length() + " node(s)");
        randomAndDelete.showList();

    }

    //6
    //6a & 6b are in LinkedList.java tab
    //6c
    public static void Q6() {
        System.out.println("\n");

        LinkedList<Integer> insertNum = new LinkedList<>();
        insertNum.addFrontNode(78);
        insertNum.addFrontNode(45);
        insertNum.addFrontNode(34);
        insertNum.addFrontNode(23);
        insertNum.addFrontNode(17);
        insertNum.addFrontNode(10);
        insertNum.addFrontNode(8);

        insertNum.showList();

        System.out.println("The median is " + insertNum.getMiddle());

    }
}
