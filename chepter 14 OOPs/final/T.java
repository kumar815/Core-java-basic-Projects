class Example 
{
	 /*void m1(){
		System.out.println("Example m1");
	}*/

}
class Sample extends Example
{
	final void m1(){
System.out.println("Sample m1");
	}
}
class T
{

	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.m1();
		System.out.println("Hello World!");
	}
}
