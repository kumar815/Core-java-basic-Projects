//1. We can store sub class object reference in super class type referenced variable
//But we can not store super class object reference in sub class type variable

//The basic Rule to store an object in a referenced variable
//variable side class		object side class
//ClassName refVar		= new ClassName();
//the object type class must be sub type of Variable type class
// A a1 = new B();
//class B must be sub class A
		class Animal {  }
		class Lion extends Animal{}
		class Tiger extends Animal{}

		class Zoo {
			public static void main(String[] args) {
				Animal a;
							   
				a = new Animal();
				a = new Lion();       //storing sub class object ref in super class type variable for LC
				a = new Tiger();

				//Lion l = new Animal();		//we can not store super class object in sub class type variable
														//super class does not obtain sub class type
			}
		}

//15. By using sub class type ref variable,
	//		we can access both sub class and super class members
	//		because super class members are inherited to sub class

	//	 But by using super class reference 
	//		we can not access sub class specific members
	//		if we try compiler will throw error
	//		because sub class members are not inherited to super class

		class Fan	{
				String color;
		}

		class Bajaj extends Fan{
				double price;
		}

class Test04 	{
public static void main(String[] args) {
	Fan f1 = new Bajaj();  //f1 type is Fan and f1 object type is Bajaj	
	System.out.println(f1.color);	//compiler searches varible in f1 type class Fan
//System.out.println(f1.price);		//compiler wroks with only variable type, 
//but not with variables values or variable objects
//compiler seaches color variable in Fan class
//avaiable so no error	
//compiler seaches price variable in Fan class
//not available so error
	Bajaj b1 = new Bajaj();  //f1 type is Fan and f1 object type is Bajaj	
	System.out.println(b1.color);	//compiler searches variable in b1 type class Bajaj
	System.out.println(b1.price);	//color variable is not found in Bajaj, with the extends
				//keywords compiler can find it in Fan class
			}
		}

