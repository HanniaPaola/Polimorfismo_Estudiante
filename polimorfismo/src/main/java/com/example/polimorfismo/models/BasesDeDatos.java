package com.example.polimorfismo.models;

import java.util.List;
public interface BasesDeDatos {
    void save(Student student);
    void update(Student student);
    List<Student> getBase();
}