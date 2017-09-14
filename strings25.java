class Strings{
	public static void main(String[] args){
		String str = "prasanna.kumar@gmail.com";
		String dot = "";
		for(int i = 0 ; i < str.length() ; i++){
			if(str.charAt(i) == '.') {
				break;
			}
			dot = dot + str.charAt(i);
		}
		System.out.println( dot );
	}
}