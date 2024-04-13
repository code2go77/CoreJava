package org.io.code2go.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DriverMain {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("B");
        names.add("A");

        //duplicate allow in any form of List interface
        names.add("B");
        //set element in particular index
        //names.set(2, "C");




        System.out.println(names);

    }

}
