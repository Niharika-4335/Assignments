package com.seleniumexpress.task;

public class Airtel {
    private Service service;

    public Airtel(Service service) {
        this.service = service;
    }
    public void wantedServices(){
        service.service();
    }
}
