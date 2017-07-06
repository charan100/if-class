class Dog{
	private void eat(){  //static binding
		System.out.println("dog is eating..");
	}
	public static void main(String[] args){
		Dog d = new Dog();
		d.eat();
	}
}