interface Printable{
	void print();
}
interface Showable{
	void show();
}
class A implements Printable,Showable{ //multiple inheritance by Interface
	public void print(){
		System.out.println("Hello");
	}
	public void show(){
		System.out.println("welcome");
	}
	public static void main(String[] args){
		A a = new A();
		a.print();
		a.show();
	}
}