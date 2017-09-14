class Strings{  
	public static void main(String args[]){  
		String s1="charan";  
		String s2="charan";  
		String s3=new String("charan");  
		System.out.println(s1==s2);
		System.out.println(s1==s3);  s3 refers to instance created in nonpool
	}  
}