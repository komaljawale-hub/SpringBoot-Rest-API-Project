package com.practice.restapi.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    @Column(name  = "name")
    private String name;
    @Column(name  = "percentage")
    private Float percentage;
    @Column(name = "branch")
    private String branch;
    @Column
    private String address;

    public Student(){

    }

    public Student(String name, Float percentage, String branch, String address) {
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
        this.address = address;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", branch='" + branch + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
