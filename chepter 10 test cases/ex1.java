class Example{
 static int a=10;

 public static void main(String[] args){
 System.out.println("main method start");
 System.out.println(Example.a);
 Example e1=new Example();
 System.out.println("d:+d");
 System.out.println("main method end");
 }
 static{
 System.out.println("b");
 }

 }