interface Printable{
	void print();
}
interface Showable extends Printable{ //interface extends interface
	void show();
}
class TestInterface implements Showable{ //class implements interface
	public void print(){
		System.out.println("Hello");
	}
	public void show(){
		System.out.println("welcome");
	}
	public static void main(String[] args){
		TestInterface t = new TestInterface();
		t.print();
		t.show();
	}
}