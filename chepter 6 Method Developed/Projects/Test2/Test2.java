// static with current class
//create the one object in main method
//aftr that calling to method reparence.
class Test2{
static void m1(){
System.out.println("hi");
}
public static void main(String[] args){
	Test2.m1();//class name with method name calling
	//compiler activites checking to user define class Test1 available 
	//or not and syntax check
	//syntax ok .class file ganarated
	//jvm activities:- m1 block inside logic reed to send 
	//to main method O/p is hi printed. 
}
}