//1. When ever we are creating RWOs in PW, 
//first we must find the type of these objects

//2. Then first, we must create the common type as one class

//3. In this common type class, we must declare and define common fields and methods 

//4. Now we must create the individual object classes as 
//sub type classes from common class by using inheritance 

//5. With inheritance we can solve Code Redundancy, Tigh Coupling and Static binding 

//6. With inheritance we will achieve Code Reusability, Loose Coupling and Dynamic binding 

//Below progrm explains the adv of inheitance

//Parent class / Super class / Base class
class Person {

	int eyes, ears, hands, legs; //Code Reusabilty
	String name; 									//we create fields and methods
	double height, weight;  //one time here in this Parent class
	long aadhaar;									//common to all sub type object classes
															//in furute to modify a filed or method, we add code and 
	void eat(){  										//test code in this Person calss only one time common to all sub types
		System.out.println(name + " eating");
	}

	void sleep() { 
		System.out.println(name + " sleeping");
	}											
}												
//Child class / Sub class / Derived class
class Student  extends Person {	
}
class Faculty  extends Person {		
}
class Admin extends Person {
}
//7. once we create a class as sub type of an existing class 
//this new class will obtain 
//1.	type
//2.	properties and 
//3. behaviours of 
//this existing object

//8.the meaning of the new class obtain the exiting object type
//in exiting class type ref variable we can store this new class object

//it means whereever super class type object is allowed to store, pass or return
//there we can store, pass or return sub class object

//Person p1;	    //variable is of Person type, super class type

//p1 = new Person();//Person class object is allwoed to store

//p1 = new Student();//also we can store Student object, becasue it is type of Person
//p1 = new Facutly();//also we can store Faculty object, becasue it is type of Person
//p1 = new Admin();//also we can store Admin object, becasue it is type of Person

//Below program show passing sub type objects as argumet to super class type variable
class Canteen {														//Loose Coupling: single parameter accepts diff sub type objects 
	void eat(Person p) {		//eat(s1)	_/						//one referenced variable or one parameter
		System.out.println(p);	//eat(f1)	_/						//can accept all diff objects of same type
		p.eat();									//eat(a1)	_/			//Dynamic Binding: the invoked method is executed from 
	}																						//the sub class whose object is passed at runtime 
}

//9. The meaning sub class obtain super class properites and behaviours is 
//we can access all members of super class  by using sub class reference, 
//there is no CE, no RE, we will get OP
class Test02   {
	public static void main(String[] args) {
		Student s1 = new Student();  
	
		System.out.println(s1.eyes);//accessing super class members by using sub clas reference s1
		System.out.println(s1.ears);//no error, because of inheritance all members of super class Person 
		System.out.println(s1.hands);//are inherited to sub class Student
		System.out.println(s1.legs);		
		System.out.println(s1.name);//we are access super class Person members                                                               
		System.out.println(s1.height);//by using sub class reference with our recreating them in sub class                         
		System.out.println(s1.weight);//as if they were defined in sub class. hence this feature is called code reusability   
		System.out.println("Aadhaar_Num:"+s1.aadhaar);
		s1.eat();
		s1.sleep();
		System.out.println();

		s1.eyes = 2;
		s1.ears = 2;
		s1.hands = 2;
		s1.legs = 2;
		s1.name = "hari";
		s1.height = 6;
		s1.weight = 200;
		s1.aadhaar = 786543671234L;

		System.out.println("Person eyes:"+s1.eyes);
		System.out.println("Person ears:"+s1.ears);
		System.out.println("Person hands:"+s1.hands);
		System.out.println("Person legs:"+s1.legs);
		System.out.println("Person name:"+s1.name);
		System.out.println("Person height:"+s1.height);
		System.out.println("Person weight:"+s1.weight);
		System.out.println("Person Aadhaar_Num:"+s1.aadhaar);
		s1.eat();
		s1.sleep();
		System.out.println();

		Canteen hkCanteen = new Canteen();
		hkCanteen.eat(new Student());
		hkCanteen.eat(new Faculty());
		hkCanteen.eat(new Admin());

		Cook c1 = new Cook();
		//System.out.println(c1.eyes);
		//hkCanteen.eat(new Cook());

	}
}

class Cook {  //is Cook a Peson? 
//Nooooooo, in Programming World	
//Yeeeeeessss, in Real World		
}
