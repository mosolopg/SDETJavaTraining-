package basics;

public class SalaryCalculator {
    public static void main(String[] args){
        //Let's create a variable to define our career
        //declare a variable
        String career;
        System.out.println("Program is starting");
        // define a variable
        career = "Software Developer";
        System.out.println("My Career : " + career);

        //Declare & define
        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        double rate = 42.50;

        double salary = hoursPerWeek * weeksPerYear * rate;
        System.out.println("salary is " + salary);
        int temperature = 55;
        String sunCondition = "Overcast";

        if (temperature > 80){
            System.out.println("It's pleasant, wear shorts and t-shirts");
        } else if ((temperature > 60) && (sunCondition != "Sunny")) {
            System.out.println("It's a little cooler, perhaps wear a long sleeve, shirt and jean");
            System.out.println("wear a hat to keep the sun out of their faces");

        } else if ((temperature > 50) || (sunCondition == "Overcast")) {
            System.out.println("This is a cool day, Make sure to wear warmer clothes");

        } else {
            System.out.println("Looks like a cold day, bring a sweater");
        }

        //Compute our annual salary
        //rate * hoursPerWeek * weeksPerYear
    }
}
