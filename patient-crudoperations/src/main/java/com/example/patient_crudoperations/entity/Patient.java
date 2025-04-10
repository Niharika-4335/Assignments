package com.example.patient_crudoperations.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pid")
    private Integer pid;

    @Column(name="name")
    private String name;

    @Column(name="phno")
    private String phno;

    @Column(name="address")
    private String address;

    public Patient() {
    }

    public Patient(Integer pid, String name, String phno, String address) {
        this.pid = pid;
        this.name = name;
        this.phno = phno;
        this.address = address;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Patient{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", phno='" + phno + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
