package Lesson_5;

public class Lesson_5 {

    public static void main(String[] args) {

        Employee arr[] = new Employee[5];
        arr[0] = new Employee("Max Ivanov", "designer", "ivanov@gmail.com", "0723874564", 30000, 47);
        arr[1] = new Employee("Marina Petersson", "administrator", "marina@gmail.com", "0723875944", 25000, 42);
        arr[2] = new Employee("Tatiana Galitskaya", "programmer", "galitskaya@gmail.com", "07473574564", 30000, 36);
        arr[3] = new Employee("Roman Pavlov", "clouddeveloper", "rom@gmail.com", "07376274564", 40000, 45);
        arr[4] = new Employee("Lisa Strom", "writer", "strom@gmail.com", "0787574564", 27000, 37);

        System.out.println("Employees older than 40 are: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].age >= 40){
                arr[i].info();
            }

        }

    }
}