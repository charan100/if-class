class Bike{
	int speed;
	Bike (){
		//super();    //compiler 
		System.out.println("Constructor is invoked");
	}
	{
		System.out.println("instance initilizer block invoked");
	}
	public static void main(String[] args){
		Bike b1 = new Bike();
		Bike b2 = new Bike();
	}
}