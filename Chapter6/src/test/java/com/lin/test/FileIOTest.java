package com.lin.test;

import java.io.File;

public class FileIOTest {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Administrator\\Desktop\\test");
        digui(f,0);
    }

    public static void digui(File f,int i){
        File[] files = f.listFiles();
        int index= 0;
        for(File f2:files){
            if(f2.isFile()){
                index = i;
                while(i>0) {
                    System.out.print("\t");
                    i--;
                }
                i=index;
                System.out.println(f2.getName());
            }else{
                index = i;
                while(i>0) {
                    System.out.print("\t");
                    i--;
                }
                i=index;
                System.out.println(f2.getName());
                index++;
                digui(f2,index);

            }
        }
    }

}
