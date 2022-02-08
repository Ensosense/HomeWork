package Lesson_5;

public class Employee {
    public String name;
    public String position;
    public String email;
    public String telNumber;
    public int salary;
    public int age;

    public Employee(String name, String position, String email, String telNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Name: " + name +
                " , position: " + position +
                " ,email: " + email +
                " , telephonenumber: " + telNumber +
                ", salary: " + salary +
                ", age: " + age);
    }

}
