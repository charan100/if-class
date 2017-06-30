class Animal{
	void eat(){
		System.out.println("eating...");
	}
}
/*class B{
	void eat(){
		System.out.println("tail...");
	}
}
class Cat extends Animal,B{
	void meow (){
		System.out.println("meow...");
	}
}*/
class Cat extends Animal{
	void meow (){
		System.out.println("meow...");
	}
}
class Dog extends Animal{    //Hierarchical Inheritance
	void bark (){
		System.out.println("barking...");
	}
}
class BabyDog extends Dog{   //multilevel inheritance
	void weep(){
		System.out.println("weeping...");
	}
}
class TestInheritance{
	public static void main(String[] args){
		BabyDog d = new BabyDog();
		d.bark();
		d.eat();
		d.weep();
	}
}  //
	public static void main(String[] args){
		Cat c = new Cat();
		c.meow();
		c.tail();
		c.eat();
	}
}