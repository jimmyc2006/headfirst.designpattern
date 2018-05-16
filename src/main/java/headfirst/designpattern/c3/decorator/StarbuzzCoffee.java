package headfirst.designpattern.c3.decorator;

import headfirst.designpattern.c3.decorator.beverage.Espresso;
import headfirst.designpattern.c3.decorator.beverage.HouseBlend;
import headfirst.designpattern.c3.decorator.condiment.Mocha;
import headfirst.designpattern.c3.decorator.condiment.Soy;
import headfirst.designpattern.c3.decorator.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        
        Beverage beverage3 = new Espresso();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
