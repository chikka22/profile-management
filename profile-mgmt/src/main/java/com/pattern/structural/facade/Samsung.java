package com.pattern.structural.facade;

/**
 * Created by vgandsa on 12/20/15.
 */
public class Samsung implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println(" Samsung galaxy tab 3 ");
    }
    @Override
    public void price() {
        System.out.println(" Rs 45000.00 ");
    }
}