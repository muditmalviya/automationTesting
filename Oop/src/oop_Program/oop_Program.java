package oop_Program;


//Encapsulation
class Person {
 private String name;
 private int age;

 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getter and Setter methods
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }
}

//Inheritance
class Student extends Person {
 private int studentId;

 // Constructor
 public Student(String name, int age, int studentId) {
     super(name, age);
     this.studentId = studentId;
 }

 // Getter and Setter method for studentId
 public int getStudentId() {
     return studentId;
 }

 public void setStudentId(int studentId) {
     this.studentId = studentId;
 }
}

//Polymorphism
interface Animal {
 void sound();
}

class Dog implements Animal {
 public void sound() {
     System.out.println("Dog barks");
 }
}

class Cat implements Animal {
 public void sound() {
     System.out.println("Cat meows");
 }
}

//Abstraction
abstract class Shape {
 abstract void draw();
}

class Circle extends Shape {
 void draw() {
     System.out.println("Drawing Circle");
 }
}

class Rectangle extends Shape {
 void draw() {
     System.out.println("Drawing Rectangle");
 }
}

public class oop_Program {
	public static void main(String[] args) {
        // Encapsulation
        Person person = new Person("John", 25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Inheritance
        Student student = new Student("Alice", 20, 12345);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());

        // Polymorphism
        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();

        // Abstraction
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}
