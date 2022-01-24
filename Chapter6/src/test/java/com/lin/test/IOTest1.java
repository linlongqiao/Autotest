package com.lin.test;

import java.io.*;

public class IOTest1 {
    public static void main(String[] args) throws IOException{
//        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\test\\奥术大师.txt");
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test\\奥术大师2.txt");
//        int len;
//        while((len=fis.read())!=-1){
//            fos.write((char)len);
//        }
//        byte[] b = new byte[1024];
//        int len;
//        while((len=fis.read(b))!=-1){
//            fos.write(b);
//        }
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\test\\奥术大师.txt"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test\\奥术大师2.txt"));
//
//        int len;
//        while ((len = bis.read()) != -1) {
//            bos.write((char) len);
//        }
//        bos.flush();
//        bis.close();
//        bos.close();
//
//          InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\test\\奥术大师.txt"));
//          OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test\\奥术大师2.txt"));
//        int len;
//        while((len=isr.read())!=-1){
//            osw.write((char)len);
//        }
//        char[] b = new char[1024];
//        int len;
//        while((len=isr.read(b))!=-1){
//            osw.write(b);
//        }

//        isr.close();
//        osw.close();
//        FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\test\\奥术大师.txt");
//        FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\test\\奥术大师2.txt");

//        int len;
//        while((len=fr.read())!=-1){
//            fw.write((char)len);
//        }
//        fw.flush();
//        char[] b = new char[1024];
//        int len;
//        while((len=fr.read(b))!=-1){
//            fw.write(b);
//        }
//
//        fr.close();
//        fw.close();
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\test\\奥术大师.txt")));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test\\奥术大师2.txt")));

//        int len;
//        while((len=br.read())!=-1){
//            bw.write((char)len);
//        }
//        char[] b = new char[1024];
//        int len;
//        while((len=br.read(b))!=-1){
//            bw.write(b);
//        }
//        br.close();
//        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\test\\奥术大师.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\test\\奥术大师2.txt"));

//        int len;
//        while((len=br.read())!=-1){
//            bw.write((char)len);
//        }
//        char[] b = new char[1024];
//        int len;
//        while((len=br.read(b))!=-1){
//            bw.write(b);
//        }
       String s;

       while((s=br.readLine())!=null){
           bw.write(s);
           bw.newLine();
        }

        br.close();
        bw.close();
    }


}
