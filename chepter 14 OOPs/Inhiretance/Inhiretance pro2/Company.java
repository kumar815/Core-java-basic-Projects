class	Laptop { }
class Dell {  }									//no inheritance, so Dell is not sub type of Laptop
//with Laptop reference we can not use Dell
class Lenovo extends Laptop {  }//inheritance is developed. So Lenovo is sub type of 
//Loptop. With Laptop reference we can use Lenovo
class  Developer{
	void writeCode(Laptop l) {
		System.out.println("writing code by using Laptop " + l);
	}
}
class Company{
	public static void main(String[] args) {
		Developer pavanReddy = new Developer();
		//pavanReddy.writeCode(new Dell()); //CE: Dell is not sub type of Laptop
		pavanReddy.writeCode(new Lenovo()); //no CE
	}
}