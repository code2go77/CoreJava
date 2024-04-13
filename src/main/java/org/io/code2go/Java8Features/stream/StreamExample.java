package org.io.code2go.Java8Features.stream;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i=1; i < 100; i++) list.add(i);

        //sequential stream
        Stream<Integer> seqStream = list.stream();

        //parallel stream
        Stream<Integer> parallelStream = list.parallelStream();

        //using lambda with Stream API, filter example
        Stream<Integer> highNum = parallelStream.filter(p -> p > 90);

        //using lambda in forEach
        highNum.forEach(p -> System.out.println("High Nums parallel Stream="+p));

        Stream<Integer> highNumSeq = seqStream.filter(p -> p > 90);

        highNumSeq.forEach(p -> System.out.println("High Nums sequential Stream="+p));






    }
}
