interface Printable{
	void print();
}
interface Showable{
	void print(); //we can't override interface method
}
class TestInterface implements Printable,Showable{
	public void print(){
		System.out.println("hello");
	}
	public static void main(String[] args){
		TestInterface t = new TestInterface();
		t.print();
	}
}