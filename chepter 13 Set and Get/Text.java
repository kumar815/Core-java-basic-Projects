class Text{
public static void main(String[] args){
Example e1=new Example();
Example e2=new Example();
e1.set(10,20);
e2.set(30,40);

e1.display();
e2.display();

e1.set(1,2);
e2.set(3,4);

e1.display();
e2.display();
}
}