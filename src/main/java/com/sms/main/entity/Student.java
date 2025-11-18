package com.sms.main.entity;

import jakarta.persistence.*;

@Entity
@Table(name =  "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;

    @Column
    private String name;

    @Column
    private String branch;

    @Column
    private long phoneNo;


    public Student(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", branch='" + branch + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
