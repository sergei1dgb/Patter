package com.sergo.singleton;

public class Singleton {
    private static Singleton singleton;
    String s = "I exist";
    private Singleton(){}
    public static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
