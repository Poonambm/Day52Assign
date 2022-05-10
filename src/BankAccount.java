public class BankAccount {

    private String name;
    private double balance;

    public BankAccount(String customerName, double accbalance) {
        this.balance = accbalance;
        this.name = customerName;
    }

    public void deposit(double deposit) {

        balance = deposit + balance;

    }

    public void withdrawal(double withdrawl) {
        balance = balance - withdrawl;

    }

    public void printCustomer() {
        System.out.println("My Account balance: " + this.balance);
        System.out.println("The customer's name is " + this.name);
    }

    public void printBankTransfer() {
        System.out.println( this.name + "'s account balance: " + this.balance);
       
    }


}
