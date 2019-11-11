package com.sergo.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.s);
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton==singleton1);
        singleton.s = "Sergo";
        System.out.println(singleton1.s);
    }
}
