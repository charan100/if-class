class Strings{  
	public static void main(String args[]){  
		String s1="charan";  
		String s2="chinna";  
		String s3=new String("charan");  
		String s4="CHARAN";  
		System.out.println(s1.equalsIgnoreCase(s2));  //false
		System.out.println(s1.equalsIgnoreCase(s3));  //true
		System.out.println(s1.equalsIgnoreCase(s4));  //true
	}  
}  