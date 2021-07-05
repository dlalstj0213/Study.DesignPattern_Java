package com.study.design.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        ICar iCar = new Audi(1000);
        iCar.showPrice();

        //a3
        ICar audi3 = new A3(iCar, "A3");
        audi3.showPrice();

        //a4
        ICar audi4 = new A4(iCar, "A4");
        audi4.showPrice();

        ICar audi5 = new A5(iCar, "A5");
        audi5.showPrice();
    }
}
