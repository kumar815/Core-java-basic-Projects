package p2;
import p1.A;
class C extends A{
public static void main(String[] args){
//System.out.println("a:" + A.a); //private not allowed
//System.out.println("b:" + A.b); //out side package not allowed
System.out.println("c:" + A.c); 
System.out.println("d:" + A.d);
//System.out.println();

//System.out.println("a:" + C.a);
//System.out.println("b:" + C.b);
System.out.println("c:" + C.c);
System.out.println("d:" + C.d);
}
}