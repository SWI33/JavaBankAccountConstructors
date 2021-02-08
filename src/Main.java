

public class Main {

    public static void main(String[] args) {
        //bankAccount billsAccount = new bankAccount("12333342",0.00, "bill bill", "bill@gmail.com", "762-332-3334");
        //System.out.println(billsAccount.getCustomerPhoneNumber());
        //System.out.println(billsAccount.getBalance());
        //System.out.println(billsAccount.getCustomerName());
        //System.out.println(billsAccount.getCustomerEmailAddress());

        //billsAccount.deposit(50.0);
        //billsAccount.deposit(51.0);
        //billsAccount.withdraw(100.0);
        //bankAccount bobsAccount = new bankAccount("bob", "bob@gmail.com","7623218394");
        //System.out.println(bobsAccount.getCustomerPhoneNumber());

        VipCustomer gageCustomer = new VipCustomer("gage", 1200, "gage@gmail.com");
        System.out.println(gageCustomer.getCreditLimit());
        System.out.println(gageCustomer.getEmailAddress());
        System.out.println(gageCustomer.getVipName());



    }

}