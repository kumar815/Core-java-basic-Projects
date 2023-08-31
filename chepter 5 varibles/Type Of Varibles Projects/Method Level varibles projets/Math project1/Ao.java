//method level varibles with clv program
/*develop progrme to store two integers common at class level common 
to all methods to perform add,sub,mul,div in four diff methods.s
inside each methos store result by using a varible  then displayed*/
//this main execute program name "Maths.java".
class Ao{
int a;//inside class out side all methods
int b;
void add(){//inside method used for storing values
int res = a+b;
System.out.println("Addition:" + res);
}
void sub(){
int res = a-b;
System.out.println("Subtraction:" + res);
}
void mul(){
int res = a*b;
System.out.println("Multification Result:" + res);
}
void div(){
int res = a/b;
System.out.println("Division Result:" + res);
}
}