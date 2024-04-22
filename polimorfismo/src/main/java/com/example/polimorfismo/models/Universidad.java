package com.example.polimorfismo.models;
public class Universidad {
    BasedeDato1 base1;
    BasedeDato2 base2;
    BasedeDato3 base3;
    public Universidad(BasedeDato1 base1, BasedeDato2 base2, BasedeDato3 base3) {
        this.base1 = new BasedeDato1();
        this.base2 = new BasedeDato2();
        this.base3 = new BasedeDato3();
    }
    public BasedeDato1 getBase1() {
        return base1;
    }
    public BasedeDato2 getBase2() {
        return base2;
    }
    public BasedeDato3 getBase3() {
        return base3;
    }
}