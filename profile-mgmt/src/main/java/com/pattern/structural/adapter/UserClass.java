package com.pattern.structural.adapter;

/**
 * Created by vgandsa on 12/20/15.
 */
public class UserClass {
    Logger logger;

    public  UserClass(Logger logger){
        this.logger=logger;
    }

    public void write(String txt){
        logger.out(txt);
    }
}
