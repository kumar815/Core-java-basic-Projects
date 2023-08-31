class Constructor{
int a;
int b;

Constructor(int d){
	System.out.println("constructor is executing");
	a=10;
	b=20;
int c=a+b+d;

	System.out.println("add of two numbers is:"+c);
}
	{
		System.out.println("this is non static block");
	}
	void subtraction(int e){
		int c=a-b;
		int d=c-e;
		System.out.println("subtraction of two numbers is:"+c);
		System.out.println("subtraction of two numbers is:"+d);
	}
public static void main(String[] args){
	System.out.println("main method is executing");
	Constructor c=new Constructor(10);
	c.subtraction(15);
}
}

