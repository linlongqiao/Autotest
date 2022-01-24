package com.lin.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("hello","word");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String

                > m: entries){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }

    }

}
