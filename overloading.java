class Adder{
	static int add(int a,int b){
		return a+b;
	}
	static double add(double a,double b,double c){  //changing the datatype of arguments,no.of arguments
		return a+b+c;
	}
	//static int add(int a,int b,int c){  //changing the no.of arguments
		//return a+b+c;
	//}
}
class TestOverloading{
	public static void main(String[] args){
		System.out.println(Adder.add(11,11));
		System.out.println(Adder.add(11.1,11.2,11.1));
	}
}