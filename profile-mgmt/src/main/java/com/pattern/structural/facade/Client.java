package com.pattern.structural.facade;

/**
 * Created by vgandsa on 12/20/15.


/**A Facade Pattern says that just "just provide a unified and simplified interface
 *  to a set of interfaces in a subsystem, therefore it hides the complexities of the subsystem from the client".

 In other words, Facade Pattern describes a higher-level
 interface that makes the sub-system easier to use.
 Practically, every Abstract Factory is a type of Facade.

 Advantages:
 It shields the clients from the complexities of the sub-system components.
 It promotes loose coupling between subsystems and its clients.

 Uses:
 When you want to provide simple interface to a complex sub-system.
 When several dependencies exist between clients and the implementation classes of an abstraction.

 **/
public class Client {

    public static void main(String args[]) throws NumberFormatException{
          int  choice=1;

            ShopKeeper sk=new ShopKeeper();

            switch (choice) {
                case 1:
                {
                    sk.iphoneSale();
                }
                break;
                case 2:
                {
                    sk.samsungSale();
                }
                break;
                case 3:
                {
                    sk.blackberrySale();
                }
                break;
                default:
                {
                    System.out.println("Nothing You purchased");
                }

            }


    }
}
