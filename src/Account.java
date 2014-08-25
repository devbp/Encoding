
public class Account {
	
	 private double balance = 0;
	 public Account(double balance) {
	 this.balance = balance;
	 }
	 // if ‘synchronized’ is removed, the outcome is unpredictable
	 public synchronized void deposit(double amount) {
	 if (amount < 0) {
	 throw new IllegalArgumentException("Can’t deposit.");
	 }
	 this.balance += amount;
	 System.out.println("Deposit "+amount+" in thread"+Thread.currentThread().getId()+", balance is " +balance);
	 }
	 // if ‘synchronized’ is removed, the outcome is unpredictable
	 public synchronized void withdraw(double amount) {
	 if (amount < 0 || amount > this.balance) {
	 throw new IllegalArgumentException("Can’t withdraw.");
	 }
	 this.balance -= amount;
	 System.out.println("Withdraw "+amount+" in thread " + Thread.currentThread ().getId()+ ", balance is "+balance);
	 }
}//end of account class


class WithdrawThread implements Runnable{
	 private Account account;
	 private double amount;
	 public WithdrawThread(Account account, double amount) {
	 this.account = account;
	 this.amount = amount;
	 }
	 public void run() {
	 //make a withdraw
	 account.withdraw(amount);
	 }
}//end of WithdrawThread Class

class DepositThread implements Runnable {
	private Account account;
	private double amount;
	public DepositThread(Account account, double amount) {
		this.account = account;
		this.amount = amount;
		}
	public void run() {
		//make a deposit
		account.deposit(amount);
		}
}//end DepositThread class

