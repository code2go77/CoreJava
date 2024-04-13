package org.io.code2go.Generics;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(15);

        removeEven(c);
        for(Integer i: c)
            System.out.println(c);
    }

    private static void removeEven(Collection<Integer> c) {

        Iterator<Integer> it = c.iterator();
        while(it.hasNext()) {
            int x = it.next();
            if(x%2==0)
                it.remove();
        }
    }
}
