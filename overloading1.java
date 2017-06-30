class Overloading{
	void sum(int a,long b){
		System.out.println(a+b);
	}
	void sum(int a,int b,int c){
		System.out.println(a+b+c);
	}
	public static void main(String[] args){
		Overloading o = new Overloading();
		o.sum(20,20);
		o.sum(20,20,20);
	}
}