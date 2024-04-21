package org.io.code2go.DesignPattern.SolidPrinciple.LiskovSubstitutionPrinciple;

/* Liskov Substitution Principle defines :
Use Inheritance when derived class can use Base Class perfectly */

public class LiskovSPDriver {
    public static void main(String[] args) {
        Sparrow flyingbird = new Sparrow();
        flyingbird.flyingBird();

        Ostrich bird = new Ostrich();
        bird.getInfo();
    }
}
