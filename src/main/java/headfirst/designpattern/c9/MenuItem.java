package headfirst.designpattern.c9;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        if (this.isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + this.getPrice());
        System.out.println("     -- " + this.getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
