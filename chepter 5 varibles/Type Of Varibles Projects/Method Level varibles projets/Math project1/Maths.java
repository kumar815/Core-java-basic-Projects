//method level varibles with clv program
/*develop progrme to store two integers common at class level common 
to all methods to perform add,sub,mul,div in four diff methods.s
inside each methos store result by using a varible  then displayed*/
//this link class name "Ao.java".
class Maths{
  public static void main(String[] args){
  Ao a1=new Ao();//instance1
  Ao a2=new Ao();//instance2
  Ao a3=new Ao();//instance3
  Ao a4=new Ao();//instance4
  
  a1.a=10;//a value initaialzation add
  a1.b=20;//b value initaialzation add
  a2.a=35;//a value initaialzation sub
  a2.b=10;//b value initaialzation sub
  a3.a=34;//a value initaialzation mul
  a3.b=2;//b value initaialzation  mul
  a4.a=20;//a value initaialzation div
  a4.b=2;//b value initaialzation  div
  a1.add();//method callar to class inside add
  a2.sub();//method callar to class inside sub
  a3.mul();//method callar to class inside mul
  a4.div();//method callar to class inside div
  }
}