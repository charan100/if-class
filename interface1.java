interface Drawable{  //interface declaration: by first user
	void draw();
}
//implementation: by second user
class Rectangle implements Drawable {
	public void draw(){
		System.out.println("drawing rectangle");
	}
}
class Circle implements Drawable {
	public void draw(){
		System.out.println("drawing circle");
	}
}
//implementation by third user
class TestInterface{
	public static void main(String[] args){
		Drawable d = new Circle(); //object is provided by method
		d.draw();
	}
}
