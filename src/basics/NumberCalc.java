package basics;

public class NumberCalc {
    public static void main(String [] args){
      System.out.println("program is starting");
       printName();
       int numA = 10;
       int numB = 20;
       addNumbers(numA, numB);
       multipleNumbers(numA, numB);
       int Product = multiplyNum(numA, numB);
       System.out.println("product for numbers " + numA + " and " + numB + " is " + Product);

    }

    static void printName(){
        System.out.println("My name is Pule");
    }

    static void addNumbers(int numberA, int numberB){
        //This function will add two numbers
        int sum = numberA + numberB;
        System.out.println("The Sum of numbers " + numberA + " and " + numberB + " is " + sum);
    }

    static void multipleNumbers(int numberA, int numberB){

        int multiple = numberA * numberB;
        System.out.println("The multiple of numbers " + numberA + " and " + numberB + " is " + multiple);
    }

    static int multiplyNum(int value1, int value2){
        int product = value1 * value2;
        return product;



    }
}
