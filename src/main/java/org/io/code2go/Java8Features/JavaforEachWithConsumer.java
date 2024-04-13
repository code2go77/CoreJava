package org.io.code2go.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class JavaforEachWithConsumer {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i=0; i <10; i++) {
            list.add(i);
        }

        //traversing through forEach method of Iterable with anonymous class
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::"+t);
            }
        });
        //Traverse the List using foreach with Consumer Interface
        MyConsumer myConsumer = new MyConsumer();
        list.forEach(myConsumer);

    }

    //Consumer implementation that can be reused
    static class MyConsumer implements Consumer<Integer> {

        @Override
        public void accept(Integer t) {
            System.out.println("Consumer impl Value::"+t);
        }
    }


}
