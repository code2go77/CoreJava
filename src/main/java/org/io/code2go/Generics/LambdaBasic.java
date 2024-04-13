package org.io.code2go.Generics;

public class LambdaBasic {

    public static void main(String[] args) {

        StringLength simplePrint = s -> s.length();
        System.out.println(simplePrint.inputString("hello"));
    }

    interface StringLength {
        int inputString(String s);
    }


}
