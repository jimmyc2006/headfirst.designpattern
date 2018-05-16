package headfirst.designpattern.c4.factory;

import headfirst.designpattern.c4.factory.pizza.CheesePizza;
import headfirst.designpattern.c4.factory.pizza.ClamPizza;
import headfirst.designpattern.c4.factory.pizza.PepperoniPizza;
import headfirst.designpattern.c4.factory.pizza.Pizza;
import headfirst.designpattern.c4.factory.pizza.VeggiePizza;

// 简单工厂不是"工厂模式"
public class SimplePizzaFactory {
    
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
