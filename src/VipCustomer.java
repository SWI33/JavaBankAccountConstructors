public class VipCustomer {

    private String vipName;
    private double creditLimit;
    private String emailAddress;



    public VipCustomer() {
        this("Default name",1200, "default@gmail.com" );
    }

    public VipCustomer(String vipName, double creditLimit) {
        this(vipName, creditLimit, "unknown@gmail.com");

    }

    public VipCustomer(String vipName, double creditLimit, String emailAddress) {
        this.vipName = vipName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getVipName() {
        return vipName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


}
