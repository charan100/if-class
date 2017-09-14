class A{
	A(){
		System.out.println("hello a");
	}
	A(int X){
		this();   //it is used to reuse the constructor
		System.out.println(X);
	}
}
class Testthis{
	public static void main(String[] args){
		A a = new A(5);
	}
}