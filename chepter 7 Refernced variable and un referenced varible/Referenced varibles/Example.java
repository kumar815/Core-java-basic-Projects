//referrence varibles
class Example{

}
class Sample{
	//static referanced varible
static Example e1 = new Example();
//non-static referenced varible
	Example e2 = new Example();

//parameter referanced varibles
void m1(Example e3){
// locaal referenced varible
	Example e4;
}

public static void main(String[] args){
	System.out.println(e1);
	//System.out.println(e2);
	//System.out.println(e3);
	//System.out.println(e4);

}
}