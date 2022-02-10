package Lesson_6;

public class Dog extends Animal {
    public Dog(String name, int lengthRun, int lengthSwim) {
        super(name, lengthRun, lengthSwim);
    }

    @Override
    public void run() {
        if (lengthRun > 500) {
            System.out.println("Dog " + name + " can not run more than 200 m");
        } else {
            System.out.println("Dog " + name + " run " + lengthRun);
        }
    }

    @Override
    public void swim() {
        if (lengthSwim > 10) {
            System.out.println("Dog " + name + " can not swim more than 10 m");
        } else {
            System.out.println("Dog " + name + " swam " + lengthSwim);
        }
    }
}
