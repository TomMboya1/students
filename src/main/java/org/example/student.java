package org.example;

public class student {
    private static String name;
    private static int age;
    private static String major;

    public student (String name, int age,String major){
        this.name=name;
        this .age= age;
        this.major= major;
    }

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static  String getMajor() {
        return major;
    }
}
