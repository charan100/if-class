interface A{
	void a();
	void b();
	void c();
	void d();
}
abstract class B implements A{
	public void c(){
		System.out.prinltn(" i am C");
	}
}
class M extends B{
	public void a(){
		System.out.prinltn("i am a");
	}
	public void b(){
		System.out.prinltn("i am b");
	}
	public void d(){
		System.out.prinltn("i am d");
	}
}
class TestAbstract3{
	public static void main(String[] args){
		a.a();
		a.b();
		a.c();
		a.d();
	}
}