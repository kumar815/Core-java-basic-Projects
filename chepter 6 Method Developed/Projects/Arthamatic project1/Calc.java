//Method Developing Program
//Implementing one class multiple Method Mathamatical operation progrme 
//arthamatic Method Developed for like add,sub,mul,div
//add() method with local values displayed
//sub() method by taking inputs from method caller display result
//mul() and div() methods take inputs from method caller and return result
class Arthamatic{
  static void add(){
	int a= 10;//this is local varible
	int b= 20;
	int c= a+b;
	System.out.println("Addition result:"+c);
}
  static void sub(int a,int b){//parameters
	int c = a-b;
	System.out.println("Subtraction Result:"+c);
  }
 static int mul(int a,int b){
 	int c = a*b;
	  return c;
 }
 static float div(float a,float b){
    float c = a/b;
	   return c;
 }
 }

class Calc{
	public static void main(String[] args){
		Arthamatic.add();//result 30
		Arthamatic.sub(30,1);//method call inputs values//29

		int mres=Arthamatic.mul(10,2);//non-void result stored
		System.out.println("Multification Result:" + (mres+200));//result 220

		float mdiv=Arthamatic.div(300f,4F);
		System.out.println("Division Result:" + (mdiv-20));//result 55

	}
}

