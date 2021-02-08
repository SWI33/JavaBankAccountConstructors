public class bankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber ;

    public bankAccount() {
        this("1223345432", 2.50, "Default name", "Default address", "default phone");
        System.out.println("empty constructor called");
    }


    public bankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999",100.55, customerName,customerEmailAddress,customerPhoneNumber);
    }

    public bankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println(" Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdraw) {
        if(this.balance - withdraw <0) {
            System.out.println("Only " + this.balance + " available. Withdraw Declined");
        } else {
            this.balance -= withdraw;
            System.out.println("withdraw of " + withdraw + "Processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}