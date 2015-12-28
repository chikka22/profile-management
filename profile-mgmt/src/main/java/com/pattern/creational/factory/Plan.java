package com.pattern.creational.factory;

/**
 * Created by vgandsa on 12/20/15.
 */
public abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
