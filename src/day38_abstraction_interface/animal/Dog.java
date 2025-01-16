package day38_abstraction_interface.animal;

import day36_inheritance.static_hide.A;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dogs eat from bowl");
    }
}
