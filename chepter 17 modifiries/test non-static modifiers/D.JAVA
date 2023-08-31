package p2;
import p1.A;
class D extends A{  //C

public static void main(String[] args){
A a=new A();
//System.out.println("a:" + a.a);
//System.out.println("b:" + a.b);
//System.out.println("c:" + a.c);
System.out.println("d:" + a.d);
System.out.println();


C c=new C();
//System.out.println("c:"+ c.c); 
System.out.println("d:"+ c.d);

D d=new D();
//System.out.println("c:"+ c.c);
System.out.println("d:"+ c.d);
}
}

