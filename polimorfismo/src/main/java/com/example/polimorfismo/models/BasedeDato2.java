package com.example.polimorfismo.models;

import java.util.ArrayList;

public class BasedeDato2 implements BasesDeDatos {
    private ArrayList<Student> base2 = new ArrayList<>();

    @Override
    public void save(Student student) {
        base2.add(student);
    }
    @Override
    public void update(Student student) {
        for (int i = 0; i < base2.size(); i++) {
            if (base2.get(i).getName() == student.getName()) {
                base2.set(i, student);
                break;
            }
        }
    }
    @Override
    public ArrayList<Student> getBase() {
        return new ArrayList<>(base2);
    }
}
