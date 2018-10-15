public class VipCustomer {
    String name;
    int creditLimit;
    String emailAddress;

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(int creditLimit, String emailAddress) {
        this("defaultName1", creditLimit, emailAddress);
    }

    public VipCustomer() {
        this("defaultName2", 100, "default@mail.com");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
