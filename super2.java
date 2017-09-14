class Animal{
	Animal(){
		System.out.println("Animal is created");
	}
}
class Dog extends Animal{
	Dog(){
		super(); //super keyword is added in each constructor automatically by compiler if there no super()
		System.out.println("Dog is created");
	}
}
class TestSuper{
	public static void main(String[] args){
		Dog d = new Dog();
	}
}