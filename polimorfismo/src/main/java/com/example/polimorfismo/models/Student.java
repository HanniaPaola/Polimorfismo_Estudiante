package com.example.polimorfismo.models;
public class Student {
    private String name;
    private String lasName;
    public Student(String name, String lasName) {
        this.name = name;
        this.lasName = lasName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLasName() {
        return lasName;
    }
    public void setLasName(String lasName) {
        this.lasName = lasName;
    }
    @Override
    public String toString() {
        return name + "," + lasName;
    }
}