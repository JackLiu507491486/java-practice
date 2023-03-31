package com.JAVASE_PRO.extentsDemo1;

public class MAIN {
    public static void main(String[] args) {
        Students st1 = new Students();
        st1.setAge(19);
        st1.setName("张三");

        st1.writeInformation();
        st1.seeCourse();

        Teacher t1 = new Teacher();
        t1.setAge(35);
        t1.setName("王五");

        t1.setProblem();
        t1.seeCourse();
    }
}
