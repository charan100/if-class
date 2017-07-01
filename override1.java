class Bank{
	int getRateOfInterest(){
		return 0;
	}
}
class Sbi{
	int getRateOfInterest(){
		return 9;
	}
}
class Icici{
	int getRateOfInterest(){
		return 8;
	}
}
class Axis{
	int getRateOfInterest(){
		return 7;
	}
}
class Test{
	public static void main(String[] args){
		Sbi s = new Sbi();
		Icici i = new Icici();
		Axis a = new Axis();
		System.out.println("SBI getRateOfInterest :"+s.getRateOfInterest());
		System.out.println("ICICI getRateOfInterest:"+i.getRateOfInterest());
		System.out.println("AXIS getRateOfInterest:"+a.getRateOfInterest());
	}
}