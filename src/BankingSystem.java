
public class BankingSystem {

	public BankingSystem()
	{
	 Account accountObject = new Account(100);
			 new Thread(new DepositThread(accountObject,30)).start();
			 new Thread(new DepositThread(accountObject,20)).start();
			 new Thread(new DepositThread(accountObject,10)).start();
			 new Thread(new WithdrawThread(accountObject,30)).start();
			 new Thread(new WithdrawThread(accountObject,50)).start();
			 new Thread(new WithdrawThread(accountObject,20)).start();
	}
	
}
