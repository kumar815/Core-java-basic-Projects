//Modifiers
class test{
  static int a =10; //static and new (object)
  private static void m1(){
	 System.out.println("Ex m1");
 }

  public static void main(String[] args){
  System.out.println(a);
  //a=20;
  System.out.println(a);

    }
  }

  class test01{
	public static void main(String[] args){
	System.out.println(test.a);
  }
  }