class Strings{
	public static void main(String[] args){
		String str = "prasanna";
		String counter = "";
		//int firstNonRepeating = 0;
		//int count = 0;
		int i , j;
		for( i = 0 ; i < str.length() ; i++){
			//if(count[str.charAt(i)] == 1){
			counter = counter + str.charAt(i);
			if(counter == "1"){
				break;
			}
		}
		System.out.println(str.charAt(i));
	}
}