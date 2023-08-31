class BankAccount{
static String bankName;
static String branchName;
static String ifsc;
long accNum;
String accName;
double balance;

/*
static void bankName(){
	System.out.println(bankName);
}
	static void branchName(){
	System.out.println(branchName);
}
	static void ifsc(){
	System.out.println(ifsc);
}
*/


void deposit(double amt){
	balance=balance + amt;
	System.out.println("deposit amount is:"+amt);
	System.out.println("balance after deposit is:"+balance);
}
void withdraw(double amt){
	balance=balance - amt;
	System.out.println("withdraw amount is:"+amt);
	System.out.println(" balance after withdraw is:"+balance);
	
}
void currentbalance(){
System.out.println("available balance is:"+balance);
}

void display(){
System.out.println(bankName);
System.out.println(branchName);
System.out.println(ifsc);
System.out.println(accNum);
System.out.println(accName);
System.out.println(balance);
}
}