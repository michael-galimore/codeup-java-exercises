import com.sun.tools.javac.Main;

import java.awt.desktop.SystemEventListener;

public class Person {
    private String name = "Jeff";

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
   public void sayHello(){
       System.out.printf("How are you today " + name + "?");
//TODO: print a message to the console using the person's name
    }
//public Person(String name){
//        this.name = name;
//}



    public static void main(String[] args){
//        Person myObj = new Person();
//        System.out.println(myObj.name);
//        System.out.println(myObj.name + " says hello!");

//        Understanding References
//        1a. true and then false
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        1b. true
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        1c. John John and Jane Jane
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

//        Create an input validation class

    }

    }


