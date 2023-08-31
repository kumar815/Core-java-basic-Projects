class Bank {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		
		//acc1.balance = -5000;
		//System.out.println("Current Balance: "+ acc1.balance);

		acc1.setBalance(-5000);
		System.out.println("Current Balance: " + acc1.getBalance());
	}
}