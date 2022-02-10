package Lesson_6;

public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal("Deer", 400,300);
        Dog dog = new Dog("Bobik", 600, 30);
        Dog dog2 = new Dog("Lada", 300, 50);
        Cat cat = new Cat("Barsik", 600, 20);
        Cat cat2 = new Cat("Simba", 200, 40);
        dog.run();
        cat.run();
        dog.swim();
        cat.swim();
        dog2.swim();
        cat2.swim();
        animal.run();
        animal.swim();



    }
}
