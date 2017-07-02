class Animal{
	void eat(){
		System.out.println("eating..");
	}
}
class Dog extends Animal {
	void eat(){
	System.out.println("eating bread...");
	}
	void bark(){
		System.out.println("barking...");
	}
	void work(){
		super.eat();  //to call parent class method we need to use super keyword
		bark();
	}
}
class TestSuper{
	public static void main(String[] args){
		Dog d = new Dog();
		d.work();
	}
}