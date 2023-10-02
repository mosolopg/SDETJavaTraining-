package oop;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "132478";
        acc1.setName("Roger Hue");
        acc1.setSsn("12345678");
        System.out.println("SSN: " + acc1.getSsn());
        System.out.println("NAME: " + acc1.getName());
        acc1.setRate();
        acc1.increaseRate();

/*
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.withdraw(2000);
*/
       // System.out.println(acc1.toString());


        BankAccount acc2 = new BankAccount("CHEQUE");
        BankAccount acc3 = new BankAccount("SAVINGS", 900);
        acc3.checkBalance();



    }
}
