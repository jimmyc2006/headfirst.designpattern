package headfirst.designpattern.c3.decorator.beverage;

import headfirst.designpattern.c3.decorator.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
