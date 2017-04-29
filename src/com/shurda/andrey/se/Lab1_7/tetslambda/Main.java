package com.shurda.andrey.se.Lab1_7.tetslambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Lab1-7-1
 * 1) Create a class Main with a main() method, which creates array of Integer type and fills it
 * with random values. Add in a main() method of the sorting code an array of integer values in
 * descending order, using lambda expressions to specify the sort order.
 * 2) Add in a main() method code that creates a list of strings and sorts  it in the reverse
 * alphabetical order. Using lambda expressions to specify the sort order.
 * <p>
 * Lab1-7-2
 * 1) Add in a Main class a sumEven() static method that takes two parameters: the first - an array of integers,
 * and the second - the predicate of Predicate<Integer> type for selecting numbers.
 * 2) Add in a main() method code that invokes sumEven() method and in the form of a lambda expression specifies
 * the selection condition the values of the array elements.
 * 3) Add in a Main class a printJStr() static method that takes two parameters: the first - an list of strings,
 * and the second - the predicate of Predicate<String> type for the selection of strings beginning with a given letter.
 * 4) Add in a main() method code that invokes printJStr() method and in the form of a lambda expression specifies the
 * selection condition the strings.
 * <p>
 * Lab1-7-3
 * 1) Add a MyConverter functional interface that contains an convertStr(String str) abstract method to convert a string
 * to uppercase and a isNull(String str) static method to check the string to null.
 * 2) Add in a Main class a updateList() static method, which converts the strings of list to uppercases.
 * 3) Add in a main() method code that invokes updateList() method and output the result.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("lab1-7-1");
        System.out.println("Array before sort");
        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println("Array after sort");
        Arrays.sort(array, ((o1, o2) -> o2 - o1));
        System.out.println(Arrays.toString(array));


        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("hay");
        list.add("world");
        list.add("list");
        list.add("string");
        list.add("South");

        System.out.println("List before sort");
        System.out.println(list);
        System.out.println();

        System.out.println("Array after sort");
        list.sort((o1, o2) -> o2.compareToIgnoreCase(o1));
        System.out.println(list);

        System.out.println();
        System.out.println("Lab1-7-2");
        Integer sum = sumEven(array, (c) -> c % 2 == 0);
        System.out.println("The sum of even numbers in array is: " + sum);

        System.out.println();
        String letter = "s";
        List<String> result = printJStr(list, (c) -> String.valueOf(c.charAt(0)).toLowerCase().equals(letter));
        System.out.println("The result list which first char is '" + letter + "' list is " + result);

        System.out.println();
        System.out.println("Lab1-7-3");

        List<String> stringList = list;
        stringList.add(null);
        System.out.println("List with 'null' " + stringList);
        System.out.println("Invoke updateList() method");
        updateList(list, (str) -> str.toUpperCase());

//        System.out.println("test");
//        String s = null;
//        System.out.println(s == null);
    }

    private static Integer sumEven(Integer[] array, Predicate<Integer> predicate) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (predicate.test(array[i])) {
                sum += array[i];
            }
        }
        return sum;
    }

    private static List<String> printJStr(List<String> list, Predicate<String> predicate) {
        List<String> result = new ArrayList<>();
        for (String item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    private static void updateList(List<String> list, MyConverter converter) {
        for (String item : list) {
            if (!MyConverter.isNull(item)) {
                System.out.println(converter.convertStr(item));
            }
        }
    }
}

