class Strings{
	public static void main(String[] args){
				String counter = ""  ;
		String str = "prasanna.kumar@gmail.com";
		//String counter = ""  ;
		for(int i = 0 ; i < str.length() ; i++){
			if(str.charAt(i) == 'a') {
				counter = counter + str.charAt(i);	
				
			}
		}
		System.out.println( counter.length() );
	}
}