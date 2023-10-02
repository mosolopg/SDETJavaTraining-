package oop;

class person{
    String name;
    String email;
    String phone;

    void walk(){
        System.out.println(name + " Is walking");

    }
    void eat(){
        System.out.println(name + " email address is " + email);

    }

    void sleep(){
        System.out.println(name + " Is sleeping");
    }
}

public class Demo {
    public static void main(String[] args) {

        //instantiating an object
        person person1 = new person();
        person person2 = new person();

        person1.name = "joe";
        person1.email ="joe@telkom.co.za";
        person1.phone ="782983";

        person2.name = "Pule";
        person2.email ="pule@gmail.com";
        person2.phone = "78299";

         //Abstraction
        person1.walk();
        person1.sleep();
        person1.eat();
       System.out.println("*************************************");
        person2.walk();
        person2.sleep();
        person2.eat();



    }
}
