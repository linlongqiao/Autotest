package com.lin.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        byte[] b = new byte[1204];
        int len = -1;
        try {
            fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\test\\暗淡.txt");
            fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test\\奥术大师.txt",true);

            while ((len = fis.read(b)) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
