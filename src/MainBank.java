public class MainBank {

    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount("Dale", 500.00);
        customer1.deposit(100.00);
        customer1.withdrawal(0);
        customer1.printCustomer();
        BankAccount customer2 = new BankAccount("Larry", 5000);
        customer2.withdrawal(100);
        customer2.printBankTransfer();
        BankAccount customer3 = new BankAccount("Mary", 300);
        customer3.deposit(100.00);
        customer3.printBankTransfer();

    }

}
