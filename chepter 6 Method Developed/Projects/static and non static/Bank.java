class Bank{
	public static void main(String[] args){
		BankAccount.bankName	= "icici";
		BankAccount.branchName	= "Bommanahalli";
		BankAccount.ifsc	   	= "icici00121";
		BankAccount acc1 = new BankAccount();		
		acc1.accNum = 123456;
		acc1.accName = "HK";
		acc1.balance = 10000; 
		System.out.println("current balance is:"+acc1.balance);
		acc1.deposit(1000);

		System.out.println("current balance is:"+acc1.balance);
		acc1.withdraw(500);
	

		BankAccount acc2 = new BankAccount();		
		acc2.accNum = 1015124321;
		acc2.accName = "AKR";
		acc2.balance = 100; 
		System.out.println("current balance is:"+acc2.balance);
		acc2.deposit(1000);
		System.out.println("current balance is:"+acc2.balance);
		acc2.withdraw(500);

	}
}