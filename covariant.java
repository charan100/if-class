class A{
	A get(){
		return this;
	}
	void message(){
		System.out.println("covariant");
	}
}
class B extends A{
	B get(){
		return this;
	}
	//void message(){
		//System.out.println("covariant return type");
	//}
	public static void main(String[] args){
		new B().get().message();
	}
}