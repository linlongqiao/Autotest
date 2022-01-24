package com.lin.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest1 {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> t = new TreeSet<Student>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                int num = s2.getSum()-s1.getSum();
                int num2 = num==0?s2.getChinese()-s1.getChinese():num;
                int num3 = num2==0?s2.getMath()-s1.getMath():num2;
                int num4 = num3==0?s2.getEnglish()-s1.getEnglish():num3;
                return num4;
            }
        });
        for(int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第"+(i+1)+"个学生的信息");
            System.out.println("姓名");
            String name = sc.nextLine();
            System.out.println("语文成绩");
            int chinese = sc.nextInt();
            System.out.println("数学成绩");
            int math = sc.nextInt();
            System.out.println("英语成绩");
            int english = sc.nextInt();

            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            t.add(s);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("Chapter6\\ts.txt"));

        for(Student s:t){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(":").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }

}
