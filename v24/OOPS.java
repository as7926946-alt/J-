// code for classes and objects 

/*class Pen{
    String colour;
    public void printcolour(){
        System.out.println("The colour of the pen is "+ this.colour);
    }
}
public class OOPS {
    public static void main(String[]args){
        Pen p1=new Pen();
        p1.colour="Black";
        Pen p2=new Pen();
        p2.colour="Blue";
        Pen p3=new Pen();
        p3.colour="Red";
        p1.printcolour();
        p2.printcolour();
        p3.printcolour();
    }
}*/

/*class Student{
    String name;
    int age;
    public void getinfo(){
        System.out.println("The name of the student is " + this.name);
        System.out.println("The age of the student is "+ this.age);
    }
}
public class OOPS{
    public static void main(String[]args){
        Student s1=new Student();
        s1.name="Anshika";
        s1.age=15;
        Student s2=new Student();
        s2.name="Saanvi";
        s2.age=21;
        s1.getinfo();
        s2.getinfo();
       
    }
}*/

// code for non parameterised constructor

/*class Student{
    String name;
    int age;
    Student(){
        System.out.println("Constructor is created");
    }
    public void getinfo(){
        System.out.println("The name of the student is " + this.name);
        System.out.println("The age of the student is "+ this.age);
    }
}
public class OOPS{
    public static void main(String[]args){
        Student s1=new Student();
        s1.name="Anshika";
        s1.age=15;
        Student s2=new Student();
        s2.name="Saanvi";
        s2.age=21;
        s1.getinfo();
        s2.getinfo();
       
    }
}*/

// code for parameterised constructor

/*class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
       
    }
    public void getinfo(){
        System.out.println("The name of the student is " + this.name);
        System.out.println("The age of the student is "+ this.age);
    }
}
public class OOPS{
    public static void main(String[]args){
        Student s1=new Student("Ayushi",22);
        s1.getinfo();
        Student s2=new Student("Bhommi",23);
        s2.getinfo();
    }
}*/

// code for copy constructor

/*class Student{
    String name;
    int age;
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){

    }
    public void getinfo(){
        System.out.println("The name of the student is " + this.name);
        System.out.println("The age of the student is "+ this.age);
    }
}
public class OOPS{
    public static void main(String[]args){
        Student s1=new Student();
        s1.name="Anshika";
        s1.age=15;
        Student s2=new Student(s1);
        s2.getinfo();
    }
}*/

// code for function overloading 

/*class Student{
    String name;
    int age;
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name ,int age){
        System.out.println(name+" " +age);
    }
}
public class OOPS{
    public static void main(String[]args){
        Student s1=new Student();
        s1.name="Aaru";
        s1.age=4;
        s1.printinfo(s1.name,s1.age);
    } 
}*/

// code for Inheritance 

/*class Shape{
    String colour; 
    public void printcolour(){
        System.out.println("The colour is "+colour);
    }  
}
class Triangle extends Shape{

}
public class OOPS{
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.colour="Blue";
        t1.printcolour();
    }
}*/

// code for single level inheritance

/*class Shape{
    public void area(){
        System.out.println("Display area of shape");
    }
}
class Triangle extends Shape{
    public void area(int h,int b){
        System.out.println(0.5*b*h);
    }
}
public class OOPS{
    public static void main(String[]args){
        Triangle t1=new Triangle();
        
        t1.area(5,10);
    }
}*/

// code for hierarchical inheritance

/*class Shape{
    public void area(){
        System.out.println("Display area of shape");
    }
}
class Triangle extends Shape{
    public void area(int h,int b){
        System.out.println(0.5*b*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class OOPS{
    public static void main(String[]args){
        Circle c1=new Circle();
        c1.area(5);
    }
}*/

// code for multilevel inheritance

/*class Shape{
    public void area(){
        System.out.println("Display area of shape");
    }
}
class Triangle extends Shape{
    public void area(int h,int b){
        System.out.println(0.5*b*h);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int side){
        System.out.println(side*side*side);
    }
}
public class OOPS{
    public static void main(String[] args) {
        EquilateralTriangle t1=new EquilateralTriangle();
        t1.area(3);
    }
}*/

// code for types of access modifiers

/*package bank;
class Account{
    public String name;     // code for showing public modifier
    String name;             // code for showing default modifier
    protected String email;  // code for showing protected modifier 
   private String password;  // code for showing private modifier 


   public void setPassword(String password) {
       this.password = password;
   }

}
public class OOPS{
    public static void main(String[]args){
        Account account1 = new Account();
        a1.name = "Apna College";
       a1.setPassword("abcd");
       a1.email = "hello@apnacollege.com";
    }
}*/

// code for abstraction 

/*abstract class Animal{
    abstract void walk();
    void breathe(){
        System.out.println("The animal is breathing air");
    }
    Animal(){
        System.out.println("You are about to create an animal");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created animal is horse");
    }
    void walk(){
        System.out.println("Walk on four legs");
    }
}
public class OOPS {
    public static void main(String[]args){
        Horse h1=new Horse();
        h1.walk();
        h1.breathe();
    }   
}*/

// code for interfaces 

/*interface Animal{
    void walk();
}
class Horse implements Animal{
    public void walk(){
        System.out.println("Horse is walking on four legs");
    }
}
public interface OOPS {
    public static void main(String[]args){
        Horse h1=new Horse();
        h1.walk();
    }  
}*/

// code for explaining static keyword

/*class Student {
   static String school;
   String name;   
}


public class OOPS {
   public static void main(String args[]) {
       Student.school = "JMV";
       Student s1 = new Student();
       Student s2 = new Student();


       s1.name = "Meena";
       s2.name = "Beena";


       System.out.println(s1.school);
       System.out.println(s2.school);
   }
}*/

