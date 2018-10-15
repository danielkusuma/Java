public class Bank {
    private String accNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNo;

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("You have deposited " + depositAmount + ", Your current balance = " + this.balance );
    }

    public void withdraw(double withdrawAmount) {
        if(balance - withdrawAmount < 0.0 ) {
            System.out.println("Can't withdraw money because Balance = " + this.balance );
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " Current Balance = " + this.balance);
        }
    }

    public Bank(String accNumber, double balance, String customerName, String email, int phoneNo) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public Bank() {
        this("defaultAccNumber", 1.0, "DefaultName", "defaultAddress", 0423232);
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
}
