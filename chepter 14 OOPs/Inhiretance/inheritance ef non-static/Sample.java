class Sample extends Example{
int y= m3();
int m3(){
System.out.println("Sa NSV");
return 20;
}
{
System.out.println("Sa NSB");
}
Sample(){
System.out.println("Sa NPC");
}
void m4(){
System.out.println("Sa NSM");
}
public static void main(String[] args){
Sample s1= new Sample();
//calling to methods 
//s1.m4();
//s1.m3();
//s1.m1();
}
}
//output
//Ex:Nsv
//Ex:Nsb
//Ex:Npc
//Sa:Nsv
//Sa:Nsb
//Sa:Npc