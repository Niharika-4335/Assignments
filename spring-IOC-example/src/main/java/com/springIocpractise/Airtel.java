package com.springIocpractise;

public class Airtel implements Sim{
    public Airtel() {
        System.out.println("called the constructor");
    }

    public void calling () {
        System.out.println("calling from airtel");
    }


    public void data () {
        System.out.println("browsing data from airtel");
    }
}
