package org.io.code2go.Java8Features.functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Interfaces {
    public static void main(String[] args) {

        Employees e1 = new Employees("a1", 2000),
                  e2 = new Employees("b1", 3000);


        // Using anonymous class before Java 8
        Comparator<Employees> aName = new Comparator<Employees>() {
            @Override
            public int compare(Employees o1, Employees o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };


        // Using Lambda expression
        Comparator<Employees> byName =
                (a, b) -> a.getName().compareTo(b.getName());
    }
}
