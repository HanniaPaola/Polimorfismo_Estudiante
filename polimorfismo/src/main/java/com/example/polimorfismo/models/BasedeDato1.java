package com.example.polimorfismo.models;
import java.util.ArrayList;
public class BasedeDato1 implements BasesDeDatos {
    private ArrayList<Student> base1 = new ArrayList<>();
    @Override
    public void save(Student student) {
        base1.add(student);
    }
    @Override
    public void update(Student student) {
        for (int i = 0; i < base1.size(); i++) {
            if (base1.get(i).getName() == student.getName()) {
                base1.set(i, student);
                break;
            }
        }
    }
    @Override
    public ArrayList<Student> getBase() {
        return new ArrayList<>(base1);
    }
}