class Strings{
	public static void main(String[] args){
		String str = "prasanna";
		String temp = "";
		//for( int i = 0 ; i<=str.length()-1 ; i++){
		for( int i = str.length()-1 ; i >= 0 ; i--){
			temp = temp + str.charAt(i);
			//temp = str.charAt(i) + temp;
			if( str.charAt(i) == 's'){
			break;
			}
		}
		System.out.println("reverse the given string is :"+temp);
	}
}
