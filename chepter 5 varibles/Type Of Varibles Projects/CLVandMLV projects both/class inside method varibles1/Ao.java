//Method level varibles inside CLV
class Ao{
 int a;//class level varibles,meant for storing Ao class object values
 int b;//common to all methods of this class
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