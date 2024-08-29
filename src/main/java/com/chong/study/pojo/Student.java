package com.chong.study.pojo;

import java.io.Serializable;

public class Student implements Serializable{
    private final  int number;
    private final  int age;
    private final  String name;
    private final float score;
    public Student(int number, int age, String name, float score) {
        this.number = number;
        this.age = age;
        this.name = name;
        this.score = score;
    }
    public int getNumber() {
        return number;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public float getScore() {
        return score;
    }
    @Override
    public String toString() {
        return "Student [number=" + number + ", age=" + age + ", name=" + name + ", score=" + score + "]";
    }
}

