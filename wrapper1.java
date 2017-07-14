public class wrapper1{   //class name and file name should be same
	public static void main(String[] args){
		//converting Integer to int 
		Integer a = new Integer(3);
		int i = a.intValue();
		int j = a;  //unboxing, now compiler will write a.intValue() internally
		System.out.println(a+" "+i+" "+j);
	}
}