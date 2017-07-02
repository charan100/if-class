class Animal{
	String color = "white";
}
class Dog extends Animal {
	String color = "black";
	void printcolor(){
		System.out.println(color);   //print color of Dog
		System.out.println(super.color); //immediate parent class instance variable
	}
}
class TestSuper{
	public static void main(String[] args){
		Dog d = new Dog();
		d.printcolor();
	}
}