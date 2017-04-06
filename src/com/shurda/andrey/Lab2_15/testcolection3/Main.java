package com.shurda.andrey.Lab2_15.testcolection3;

import java.util.*;

/**
 * Add package “com.brainacad.oop.testcollection3”. Create a class Main with a main() method.
 * Add to method main() code to create both an ArrayList and LinkedList (of String parameter type),
 * and fill each in loop with string values like: “num_” and number of current iteration (from 0 to 10). 
 * Print each list using an ordinary Iterator. Then insert one list (ArrayList) into the other (LinkedList)
 * by using an ListIterator, inserting at every other location. 
 * Now perform the insertion elements of the first list in reverse order, moving through the element from
 * end to beginning in the second list. Write a static method printElements() that uses
 * an Iterator to step through an Collection and print the each element value in the container. 
 * Execute the program.
 */
public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            String number = "number_" + i;
            arrayList.add("array " + number);
            linkedList.add("link " + number);
        }

        System.out.println();
        System.out.println("ArrayList LinkedList");
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayList.get(i));
            System.out.print("  ");
            System.out.println(linkedList.get(i));
        }

        System.out.println();
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            linkedList.add(2,iterator.next());
        }

        System.out.println("Insert ArrayList into LinkedList");
//        linkedList.addAll(arrayList);
        printElements(linkedList);

        System.out.println("Insert reverse LinkedList into ArrayList");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            arrayList.add(linkedList.get(i));
        }
        printElements(arrayList);

    }

    public static void printElements(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
