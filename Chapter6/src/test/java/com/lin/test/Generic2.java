package com.lin.test;

public class Generic2 {
    public <T> void show(T t){
        System.out.println(t);
    }

    public static void main(String[] args){
        Generic2 g = new Generic2();
        g.show(123);
        g.show(true);
        g.show("林青霞");
        g.show(12.02154);
        g.show(false);
    }


}
