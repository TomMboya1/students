package org.example;

public class Main {
    public static void main(String[]args){
        student Student = new student("tom",22,"java");

        System.out.println("name:"+student.getName());
        System.out.println("age:"+student.getAge());
        System.out.println("major:"+student.getMajor());

    }
}
