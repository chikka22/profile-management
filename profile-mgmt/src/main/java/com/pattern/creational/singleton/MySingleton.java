package com.pattern.creational.singleton;

/**
 * Created by vgandsa on 12/20/15.
 */
public class MySingleton {
        private static MySingleton obj;
        private MySingleton(){}

        public static MySingleton getA(){
            if (obj == null){
                synchronized(MySingleton.class){
                    if (obj == null){
                        obj = new MySingleton();//instance will be created at request time
                    }
                }
            }
            return obj;
        }

        public void doSomething(){
            //write your code
        }
    }


