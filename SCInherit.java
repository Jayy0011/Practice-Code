class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public String getDOB() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        if (amt > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amt;
        }
    }
}

class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phno, String dob, long loanAmount) {
        super(acc, n, add, phno, dob);
        balance = -loanAmount; // Loan amount should be negative
    }

    public void payEMI(long amt) {
        balance += amt;
        if (balance > 0) {
            balance = 0; // Prevent overpayment
        }
    }

    public void repay(long amt) {
        if (amt >= -balance) {
            balance += amt;
        } else {
            System.out.println("Amount exceeds the loan balance.");
        }
    }
}

public class SCInherit {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("12345", "John Doe", "123 Street", "555-1234", "01-01-1990");
        LoanAccount la = new LoanAccount("67890", "Jane Doe", "456 Avenue", "555-5678", "02-02-1985", 50000);

        sa.deposit(10000);
        System.out.println("Savings Account Balance: " + sa.getBalance());
        
        sa.withdraw(2000);
        System.out.println("Savings Account Balance after withdrawal: " + sa.getBalance());

        la.payEMI(10000);
        System.out.println("Loan Account Balance: " + la.getBalance());

        la.repay(40000);
        System.out.println("Loan Account Balance after repayment: " + la.getBalance());
    }
}
