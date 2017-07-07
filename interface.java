interface Printable{
	void print();
}
class A implements Printable{
	public void print(){
		System.out.println("hello");
	}
	public static void main(String[] args){
		A a = new A();
		a.print();
	}
}