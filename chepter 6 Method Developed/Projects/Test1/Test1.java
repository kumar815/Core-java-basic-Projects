
//non static with current class
//create the one object in main method
//aftr that calling to method reparence.
class Test1{
void m1(){
System.out.println("hi");
}
public static void main(String[] args){
	Test1 t=new Test1();//class new object creation
	t.m1();//t is a referance varible
	//compiler activites checking to user define class Test1 available 
	//or not and syntax check
	//syntax ok .class file ganarated
	//jvm activities:- m1 block inside logic reed to send 
	//to main method O/p is hi printed. 
}
}