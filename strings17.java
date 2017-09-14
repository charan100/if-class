class Strings{  
	public static void main(String args[]){
		String s=new String("charan");  
		String s2=s.intern();  
		System.out.println(s2);
		//System.out.println(s);
	}
}