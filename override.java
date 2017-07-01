class Vehicle{
	void run(){
		System.out.println("vehicle is running");
	}
}class Bike extends Vehicle{
	void run(){
		System.out.println("Bike is running safely");
	}
}class Test{
	public static void main(String[] args){
		Bike b = new Bike();
		b.run();
	}
}
		