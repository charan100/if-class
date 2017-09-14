class A{
	A(){
		System.out.println("parent class constructor invoked");
	}
}
class B extends A{
	B(){
		//super();
		System.out.println("child class constructor invoked");
	}
	{
		System.out.println("instance initializer block is invoked");
	}
	public static void main(String[] args){
		B b = new B();
		//B b1 = new B();
	}
}