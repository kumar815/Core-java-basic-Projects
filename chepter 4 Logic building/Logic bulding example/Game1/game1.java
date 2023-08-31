//implementing logic 
//use to one class inside multiple methods 
//its roung design but find some logic opertions
//this is code not resuablity
//this is static nature programe

class Game1{
	//addition logic
	static void car(int car1,int car2){
	int car3 = car1 + car2;
	System.out.println(car3);
	}
	//Subtraction logic
	static void car_honda(int car1,int car2){
	int car3 = car1 - car2;
	System.out.println(car3);
	}
	//Multification logic
	static void car_indica(int car1,int car2){
	int car3 = car1 * car2;
	System.out.println(car3);
	}
	//division logic
	static void car_rangerover(int car1,int car2){
	int car3 = car1 / car2;
	System.out.println(car3);
	}
	//module logic
	static void car_audi(int car1,int car2){
	int car3 = car1 % car2;
	System.out.println(car3);
 }

public static void main(String[] args){
	car(20,30);//Addition
	car_audi(30,49);//Module
	car_rangerover(20,7);//Division
	car_indica(39,50);//Multification
	car_honda(3,67);//Subtractions
}
}

