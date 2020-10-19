package com.hilda.Modul2.Polimorfisme;

public class DemoVMI {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parentChild = new Child();

        child.getData();
        parentChild.getData();
    }
}
