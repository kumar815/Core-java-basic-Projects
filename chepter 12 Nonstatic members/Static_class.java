class Static_class{
	static int a=m1();
	static int b=15;
	static
		{
		System.out.println("This is static block executing 1");
		System.out.println(a);
	}
	static int m1(){
		System.out.println("This is static user defined method");
		return 10;
	}
	
	public static void main(String[] args){
		System.out.println("This is main method");
	}
	static class A{
	    
	}
	static{
		System.out.println("This is static block 2");
	}
}

	