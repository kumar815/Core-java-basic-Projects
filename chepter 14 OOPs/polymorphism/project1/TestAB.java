class TestAB{
public static void main(String[] args){
B b = new B();
b.m1();
b.m2();
b.m3();
b.m3("abc");
//b.m3(45.3,73);// possible lossy conversion from double to float
b.m3(45.3f,73);

A a = new A();
a.m1();
a.m2();
a.m3();
a.m3("abc");
//a.m3(45.3f,65);//no suitable method found for m3(float,int)
}
}
