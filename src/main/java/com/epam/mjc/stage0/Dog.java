package com.epam.mjc.stage0;

public class Dog extends Animal {

    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    public Dog() {
        super();
        super.setColor("brown");
        super.setNumberOfPaws(4);
        super.setHasFur(true);
    }

}
