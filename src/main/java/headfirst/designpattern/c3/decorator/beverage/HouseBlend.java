package headfirst.designpattern.c3.decorator.beverage;

import headfirst.designpattern.c3.decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
}
