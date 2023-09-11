package classPack;

import java.util.Scanner;

public abstract class Toy implements Interface {
    protected String name;
    protected int count;
    protected double price;
    protected int weight;


    protected Toy(String name, int count, double price, int weight){

        this.name = name;
        this.count = count;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void sale(int x) {
        this.count -= x;

    }


    @Override
    public void chToy() {

    }

    @Override
    public void chWeight() {

    }

    @Override
    public void chDescription() {

    }
}