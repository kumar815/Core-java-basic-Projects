class Example 
{
	 private void m1(){
		System.out.println("Example m1");
	}

}
class Sample extends Example
{
	/*private void m1(){
System.out.println("Sample m1");
	}*/
	public static void main(String[] args){
		Example s=new Sample();
		s.m1();


}
}
/*class T1
{

	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.m1();
		System.out.println("Hello World!");
	}
}*/
