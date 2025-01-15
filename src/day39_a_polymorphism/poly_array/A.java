package day39_a_polymorphism.poly_array;

import java.util.Arrays;


public class A {
    @Override
    public String toString() {
        return "A";
    }
}

class B1 extends A {
    @Override
    public String toString() {
        return "B1";
    }
}

class B2 extends A {
    @Override
    public String toString() {
        return "B2";
    }
}


class C1 extends B1 {
    @Override
    public String toString() {
        return "C1";
    }
}


class D {
    @Override
    public String toString() {
        return "D";
    }
}
