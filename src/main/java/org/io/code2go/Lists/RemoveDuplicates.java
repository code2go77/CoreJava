package org.io.code2go.Lists;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println("ArrayList with duplicates: "
                + myList);

        /*Set<Integer> set = new LinkedHashSet<>();
        set.addAll(myList.stream().sorted().collect(Collectors.toList()));
        System.out.println(set);*/


        //System.out.println("ArrayList with duplicates removed: " + set.stream().sorted().collect(Collectors.toList()));


        /*List<Integer> newList = myList.stream().distinct().collect(Collectors.toList());
        System.out.println("ArrayList with duplicates removed: "
                + newList);*/

        //Using Java 8+ features
        //First Get the Frequency
        Map<Integer, Long> frequency = myList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //System.out.println(frequency.size());

        //then filter the inputs which have frequency greater than 1
        frequency.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));

        Set<Integer> set  = new HashSet<>();

        for(Integer value: myList) {
            if(set.add(value) == false) {
                System.out.println(value +"-"+ "is duplicate Value");
            }
        }
    }
}
