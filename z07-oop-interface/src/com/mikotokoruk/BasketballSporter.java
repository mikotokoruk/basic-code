package com.mikotokoruk;

import com.mikotokoruk.ex.Sporter;

public class BasketballSporter extends Sporter {
    public BasketballSporter() {
    }

    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习打篮球");
    }
}
