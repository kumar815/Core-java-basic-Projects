class BankAccount {
	public final double MIN_BALANCE = 10000;//strong encapsulation

	private double balance;  //Hide data -> Data Hiding
	String username;		//weak encapsulation
	private String password;//strong encapuslation

	public void setBalance(double balance) {						//binding filed to methods	
		if(balance <= 0)													//and providing access via methods
		System.out.println("Do not pass -ve amount");//for storing, modifying value and
		else																	//for reading value	
			this.balance = balance;												
	}																		
																	
	public double getBalance() {					
		return balance;                                   
	}                                                             
}                  