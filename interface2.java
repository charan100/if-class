interface Bank{
	float rateOfInterest();
}
class SBI implements Bank{
	public float rateOfInterest(){
		return 9.5f;
	}
}
class PNB implements Bank{
	public float rateOfInterest(){
		return 9.6f;
	}
}
class TestInterface{
	public static void main(String[] args){
		Bank b = new SBI();
		System.out.println("ROI : " + b.rateOfInterest());
	}
}