
class DataTypeCasting{
	
	public void methodOne(int i)
	{
		System.out.println("int-arg method");
	}
	public void methodOne(float fs)			//overloaded methods
	{
		System.out.println("float-arg1 method");
	}
	public static void main(String[] args)
	{
		DataTypeCasting t = new DataTypeCasting(10);
		//t.methodOne('a');//int-arg method
		//t.methodOne(10l);//float-arg method
		t.methodOne(10.00f);//C.E:cannot find symbol
				System.out.println(t.age);

	}

}