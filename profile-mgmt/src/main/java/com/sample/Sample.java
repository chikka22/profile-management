package com.sample;

import com.sample.dao.Account;
import com.sample.dao.AccountDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


/**
 *
 *
 * Sql Query:
 * drop table account;
 CREATE TABLE `account` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `value` varchar(128) NOT NULL,
 `account_id` int(45) NOT NULL,
 `account_name` varchar(128) ,
 UNIQUE KEY `account_UNIQUE` (`account_id`),

 PRIMARY KEY (`id`)) ENGINE=InnoDB AUTO_INCREMENT=93923 DEFAULT CHARSET=utf8;

 CREATE TABLE `order` (
 `order_id` int(11) NOT NULL ,
 `account_id` int(45) NOT NULL,
 PRIMARY KEY (`order_id`),
 CONSTRAINT `order_fk` FOREIGN KEY (`account_id`) REFERENCES `account` (`account_id`) )
 ENGINE=InnoDB AUTO_INCREMENT=93923 DEFAULT CHARSET=utf8;

 *
 *
 */
/**
 * Created by vgandsa on 12/21/15.
 */
public class Sample {

    public static void main(String args[]){

        boolean valid = validateInput(args);
        Integer limit;
        long sum;
        if(valid){
            String action =args[0];
            if(action.equalsIgnoreCase("sum")) {
                /**problem 1*/
                limit = Integer.parseInt(args[1]);
                sum = limit * (limit + 1) / 2;
                if (sum < 0) {
                    System.out.println("Please Enter smaller number ");
                } else {
                    System.out.println(sum);
                }
            }else if(action.equalsIgnoreCase("pojo")){
                /**problem 2*/
                 LinkedList<User> users= new LinkedList<>();
                User user = new User("Srini","Kotapalli", 20);
                users.add(user);
                sortUsers(users);
                users.forEach(user1-> {
                            System.out.println(user1);
                        }
                );

            }else if(action.equalsIgnoreCase("poly")){
            /**problem 3*/
                Animal animal = new Dog("Dog1","black",4,120,230);
               Animal animal1 = new Ostrich("Ostr","black",4,120,230);
                ArrayList<Animal> animals= new ArrayList<>();
                animals.add(animal);
                animals.add(animal1);
                animals.forEach(animal2 -> {
                    System.out.println(animal2);
                });

            }else if(action.equalsIgnoreCase("loop")){

                Info[] infos= new Info[3];
                 infos[0]= new Info("Srini","2251 Holiday Rd", "319-222-4444");
                 infos[1] = new Info("Srini1","2251 Holiday Rd", "319-222-4444");
                 infos[2] = new Info("Srini2","2251 Holiday Rd", "319-222-4444");

                for(Info info:infos){
                    System.out.println(info);

                }

            }else if(action.equalsIgnoreCase("persist")){

                AccountDAO dao= new AccountDAO();
                Account acc= new Account("SriniAccc",23L,"acc");
                Account acc1= new Account("SriniAccc",24L,"acc");

                dao.addAccount(acc);
                dao.addAccount(acc1);

                acc= dao.findAccount(23L);
                acc1 = dao.findAccount(24L);
                System.out.println(acc);
                System.out.println(acc1);
            }


        }else{
            System.out.println("Please provide action and limit params.");
        }
    }
    private static void sortUsers(List<User> users) {
        if(users!=null) {
            Collections.sort(users);
        }

    }

    private static boolean validateInput(String args[]){

        if(args.length > 1 && args[0].equalsIgnoreCase("sum")) {
            try {
                Integer limit = Integer.parseInt(args[1]);
                return limit > 0 && Integer.MAX_VALUE > limit;

            }catch (NumberFormatException ex){
                return false;
            }

        }

        return (args.length > 0 && args[0].equalsIgnoreCase("pojo"));

    }
}
