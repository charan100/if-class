class A{
	void m(){
		System.out.println("hello m");
		}
		void n(){     //current class method
			System.out.println("hello n");
			m(); //compiler autometically adds this keyword while invoking the method
		}
}
class Testthis{
	public static void main(String[] args){
		A a = new A();
		a.n();
	}
}
	
			