package labs;

import java.util.Random;

public class StudentApp {
    public static void main(String[] args) {

//Student stu1 = new Student("35627990");
        Student stu1 = new Student("35627990","Godfrey");
        Student stu2 = new Student("25678780","Koketso");
        Student stu3 = new Student("30642592","Katleho");


stu1.setUserID();
stu1.setEmailID();
stu1.enroll("Math101");
stu1.enroll("ELE112");
        stu2.setUserID();
        stu2.setEmailID();
        stu3.setUserID();
        stu3.setEmailID();

        System.out.println(stu1.toString());


}
}
class Student{

    public Student(String SSN, String name){
        iD++;
        this.SSN = SSN;
        this.name =name;
    }
    public Student(String SSN){
        this.SSN = SSN;
    }

    //properties of student


    public String name;

    private String userID;
    public String SSN;
    private static int  iD = 100;
    private String city;
    private String state;
    private int phone;
    private String EmailID;
    private double balance = 0;
    private static final int costOfCourse = 800;
    private String courses = "";

    public void setUserID(){
        Random rand = new Random();

        int min=1000;
        int max=9000;

        int randomNum = rand.nextInt(max-min + 1) + min;

        //int random = (int)(Math.random()*9000 + 1000);

        userID = iD +""+ randomNum +""+ SSN.substring(4);
        //System.out.println("Random Number: " + randomNum);

        System.out.println(userID);

    }
    public void setEmailID(){
        EmailID = name +"@student.com";
        System.out.println(EmailID);
    }


    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void enroll(){}
    public void payTuition(double amount){
        System.out.println("Paying bill: R" + amount);
        balance = balance - amount;
        checkBalance();
    }
   public void checkBalance(){
       System.out.println("Balance: R" + balance);
   }
   public void enroll(String course){
        this.courses = this.courses + "\n" + course;
        balance = balance + costOfCourse;
        System.out.println(courses);
        checkBalance();

   }
   public void showCourses(){
        System.out.println(courses);
   }

   public String toString(){
        return "[NAME: " + name + "]\n[COURSES: " + courses + "]\n[BALANCE: " + balance +"]";
   }




}
