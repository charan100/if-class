interface Drawable{
	void draw();
	default void msg(){   //we can have method body in interface, but we need to make it default method
		System.out.println("default method");
	}
}
class Rectangle implements Drawable{
	public void draw(){
		System.out.println("drawing rectangle");
	}
}
class TestInterface{
	public static void main(String[] args){
		Drawable d = new Rectangle();
		d.draw();
		d.msg();
	}
}