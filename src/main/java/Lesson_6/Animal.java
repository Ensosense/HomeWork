package Lesson_6;

public class Animal {
    public String name;
    public int lengthRun;
    public int lengthSwim;


    public Animal(String name, int lengthRun, int lengthSwim) {
        this.name = name;
        this.lengthRun = lengthRun;
        this.lengthSwim = lengthSwim;
    }

    public void run() {
        System.out.println(name + " run " + lengthRun + " m");
    }
    public void swim() {
        System.out.println(name + " swam " + lengthRun + " m");
    }
}
