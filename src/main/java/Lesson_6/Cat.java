package Lesson_6;

import java.sql.SQLOutput;

public class Cat extends Animal {

    public Cat(String name, int lengthRun, int lengthSwim) {
        super(name, lengthRun, lengthSwim);
    }

    @Override
    public void run() {
        if (lengthRun > 200) {
            System.out.println("Cat " + name + " can not run more than 200 m");
        } else {
            System.out.println("Cat " + name + " run " + lengthRun);
        }
    }

    @Override
    public void swim() {
        if (lengthSwim > 0) {
            System.out.println("Little " + name + " can not swim :( ");
        }
    }

}

