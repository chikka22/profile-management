package com.pattern.structural.adapter;
/**An Adapter Pattern says that just "convert the interface of a class into another
 * interface that a client wants".

        In other words, to provide the interface according to client
        requirement while using the services of a class with a different interface.

        The Adapter Pattern is also known as Wrapper.

 Advantage of Adapter Pattern

        It allows two or more previously incompatible objects to interact.
        It allows reusability of existing functionality

 * Created by vgandsa on 12/20/15.
 */
public class Client {

    public static void main(String args[]){
        /**I know only about logger but want to use ConsoleWriter which is not supported as my UserClass accepts of type Logger
          So i will make adapter class(intermediate) which implements Logger and extends(or through composition) ConsoleWriter*/
        Logger logger=new ConsoleLogWriter();
        UserClass log =  new UserClass(logger); //it accept only Looger type
        log.write("Hi Sunny");

    }
}
