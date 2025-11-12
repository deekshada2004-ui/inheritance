package com.tnsif.inheritancedemo;

import com.tnsif.inheritancedemo.interfacepkg.Childinterface;

public class Demo implements Childinterface {

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void print() {
        System.out.println("print");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.print();
    }
}
