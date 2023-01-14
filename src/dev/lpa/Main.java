package dev.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        String[] originalArray = new String[] {"First", "Second", "Third"};
        for (int i=0;i<originalArray.length;i++){
            System.out.println(originalArray[i]);
        }
        System.out.println(originalArray[2]);
        var originalList = Arrays.asList(originalArray);
        System.out.println("before list: " + originalList);
        originalList.set(0, "one");
        System.out.println("after list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

//        originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

    }
}


