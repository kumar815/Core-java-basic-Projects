//16. Can we access all members of super class by using sub class ref?
//Nooooooooooo, we can access only visible members, mean inherited members
//super class all members are not inherited to sub class
//private members are not inherited
//default members are not inherited to the sub class that is created in another package
//protected and public members are always inherited 

//it means private members of super class we can not access 
//in sub class or by using sub class reference in user class
class Vehicle 	{
	private String engNum;
		String vehicleNum;
	}

	class Bus extends Vehicle 	{
		void display(){
			//System.out.println(engNum);			 
			System.out.println(vehicleNum);			 
		}
	}

	class Driver 	{
		public static void main(String[] args) {
			Bus b1 = new Bus();
			//System.out.println(b1.engNum);
			System.out.println(b1.vehicleNum);
		}
	}