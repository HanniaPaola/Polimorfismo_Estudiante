package com.example.polimorfismo.models;

import java.util.ArrayList;

public class BasedeDato3 implements BasesDeDatos {
    private ArrayList<Student> base3 = new ArrayList<>() ;

    @Override
    public void save(Student student) {
        base3.add(student);
    }
    @Override
    public void update(Student student) {
        for (int i = 0; i < base3.size(); i++) {
            if (base3.get(i).getName() == student.getName()) {
                base3.set(i, student);
                break;
            }
        }
    }
    @Override
    public ArrayList<Student> getBase() {
        return new ArrayList<>(base3);
    }
}