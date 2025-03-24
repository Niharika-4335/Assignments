package com.springIocpractise;

public class Vodafone implements Sim {

    public void calling() {
        System.out.println("calling from vodafone");
    }


    public void data() {
        System.out.println("browsing data from vodafone");
    }
}
