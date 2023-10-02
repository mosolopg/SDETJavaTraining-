package oop;

public class BankAccount implements IRate {
    //Define variables
    String accountNumber;
    private static final String routingNumber = "012345";
    String name;
    String ssn;
    String accountType;
    double balance = 100.0;

    // Constructor definition: unique methods
       // 1. They are used to define / setup / initialize properties of the object
       // 2. Constructors are IMPLICITLY called upon INSTANTIATION
       // 3. The same name as the class itself
       // 4. Constructors have no return type
    BankAccount(){
        System.out.println("NEW ACCOUNT CREATED");
    }
    BankAccount(String accountType){
        System.out.println("NEW ACCOUNT: " + accountType);
    }
    BankAccount(String accountType, double initdeposit){
        System.out.println("NEW ACCOUNT: " + accountType);
        System.out.println("INITIAL DEPOSIT: R" + initdeposit);
        String Msg = null;
        if(initdeposit < 1000){
            Msg = "ERROR: minimum deposit must be atleast R1000 ";

        }else {
            Msg = "Thank you for your initial deposit of R" +initdeposit;
        }
        System.out.println(Msg);
        balance = balance + initdeposit;
    }


    //Getters / setters

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public void setRate() {
        System.out.println("SETTING RATE");
    }

    @Override
    public void increaseRate() {
        System.out.println("INCREASING RATE");
    }

    void checkBalance(){

        System.out.println("Balance is R: " + balance);
    }

    void deposit(double amount){
        balance = balance + amount;
        showActivity("DEPOSIT");
    }
    void withdraw(double amount){
        balance = balance - amount;
        showActivity("WITHDRAW");
    }

    // Private : can only be called from within the class
    private void showActivity(String activity){
        System.out.println("YOUR RECENT TRANSACTION: " + activity);
        System.out.println("YOUR NEW BALANCE IS: R" + balance);
    }
    void getStatus(){}

    @Override
    public String toString(){
        return "[" + name + " . " + accountNumber + " BALANCE: R" + balance + "]";
    }


}
