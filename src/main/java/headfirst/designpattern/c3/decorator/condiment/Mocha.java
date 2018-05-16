package headfirst.designpattern.c3.decorator.condiment;

import headfirst.designpattern.c3.decorator.Beverage;
import headfirst.designpattern.c3.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
