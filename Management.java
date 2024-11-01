class Account 
{
		private String name;
		private String accNo;
		private String address;
		private String phno;
		private String DoB;
		protected long balance;
		
		public Account(String n,String acc, String add, String phno, String DoB){
			name=n;
			accNo=acc;
			address=add;
			this.phno=phno;
			this.DoB=DoB;
			balance=0;
		}
		
		public String getName(){return name;}
		public String getAccNo(){return accNo;}
		public String getAddress(){return address;}
		public String getPhone(){return phno;}
		public String getDob(){return DoB;}
		public long getBalance(){return balance;}
			
		
		public void setAddress(String add){
			address=add;
			}
		public void setPhone(String phno){
			this.phno=phno;
			}
		
}
	
class SavingAccount extends Account{
	
	public SavingAccount(String n,String acc, String add, String phno, String DoB){
		super(acc,n,add,phno,DoB);
	}
	
	public void deposit(int amt){
		balance+=amt;
		}
	public void withdraw(int amt){
		balance-=amt;
		}
}

class LoanAccount extends Account
{
	public LoanAccount(String n,String acc, String add, String phno, String DoB, long loanAmount){
		super(acc,n,add,phno,DoB);
		balance= -loanAmount;
	}
	public void payEMI(long amt){
		balance-=amt;
		}
	public void repay(long amt){
		if(balance==amt)
			balance=0;
	}
}
 
 public class Management
 {
	 public static void main(String[] args){
		
		SavingAccount sa = new SavingAccount("12345", "John Doe", "123 Street", "555-1234", "01-01-1990");
        LoanAccount la = new LoanAccount("67890", "Jane Doe", "456 Avenue","555-5876","02-02-1985",50000);
		
		sa.deposit(10000);
        System.out.println("Savings Account Balance: " + sa.getBalance());
		sa.Account();
	 }
 }
