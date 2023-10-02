package labs;

public class BankAccountApp {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("465329874", 1500);
        BankAccount acc2 = new BankAccount("782016514", 2000);
        BankAccount acc3 = new BankAccount("902641578",3000);

        acc1.setName("Jim");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.makeDeposit(1000);
        acc1.payBill(1200);
        acc1.accrue();
       System.out.println(acc1.toString());

    }
}

class BankAccount implements IInterest{
    //properties of bank account
    private static int iD = 1000;  // Internal ID
    private String accountNumber;  // ID + random 2-digit number + first 2 of SSN
    private String routingNumber;
    private String name;
    private String SSN;
    private double balance;

    // Constructor
    public BankAccount(String SSN, double initDeposit){
        balance = initDeposit;
        //System.out.println("New account created");
        this.SSN = SSN;
        iD++;
        setAccountNumber();

    }
    private void setAccountNumber(){
        int random = (int) (Math.random() * 100);
        accountNumber = iD + "" + random + "" + SSN.substring(0, 2);
        System.out.println("Your Account Number: " + accountNumber);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public  void payBill(double amount){
        System.out.println("Paying bill: R" + amount);
        balance = balance - amount;
        showBalance();
    }
    public void makeDeposit(double amount){
        System.out.println("Making deposit: R" + amount);
        balance = balance + amount;
        showBalance();
    }
    public void showBalance(){
        System.out.println("Balance: " + balance);
    }

    @Override
    public void accrue() {
        balance = balance * (1 + rate/100);
        showBalance();
    }
    public String toString(){
        return "[Name: " + name +" ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance : " + balance + "]";
    }
}
