class Working{
 int a =10;//class level varibles,meant for storing Ao class objectvalues
 int b =20;//common to all methods of this class
 void add(){
 int res = a+b;
 System.out.println(res);
 }
 void sub(){
 int res = a-b;
 System.out.println(res);
 }
 void mul(){
 int res = a*b;
 System.out.println(res);
 }
 void div(){
 int res = a/b;
 System.out.println(res);
 }
}