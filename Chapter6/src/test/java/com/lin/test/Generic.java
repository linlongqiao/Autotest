package com.lin.test;

public class Generic<T> {
    public void show(T t){
        System.out.println(t);
    }
    public static void main(String[] args){
        Generic<String> g = new Generic<String>();
        g.show("林青霞");
        Generic<Integer> g2 = new Generic<Integer>();
        g2.show(123);
        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.show(true);

    }


}
