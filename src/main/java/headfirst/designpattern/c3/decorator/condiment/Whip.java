package headfirst.designpattern.c3.decorator.condiment;

import headfirst.designpattern.c3.decorator.Beverage;
import headfirst.designpattern.c3.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }
}
