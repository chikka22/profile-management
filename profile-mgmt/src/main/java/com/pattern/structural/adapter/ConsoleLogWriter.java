package com.pattern.structural.adapter;

/**
 * Created by vgandsa on 12/20/15.
 */
//this is the adapter class which acts between client and actual library
public class ConsoleLogWriter extends ConsoleWriter implements Logger {
    @Override
    public void out(String txt) {
        this.writeConsole(txt);
    }
}
