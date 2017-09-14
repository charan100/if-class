class Strings{
	public static void main(String[] args){
		String str = "prasanna kumar@gmail.com";
		String name = "";
		for(int i = 0 ; i < str.length() ; i++){
			//System.out.println("inside for loop");
			//System.out.println("inside char comparision");
			if(str.charAt(i) == '@') {
				//System.out.println("inside char @ comparision");
				break;
			}
			name = name + str.charAt(i);
			//System.out.println("inside char after @ comparision down");
		}
		//String lineWithOutWhiteSpace = name.replaceAll("\\s+","");
		//System.out.println("Final output ----------------------");
		System.out.println( name );
	}
}