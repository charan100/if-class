class Strings{
	public static void main(String[] args){
		int count = 0 ;
		int i , j;
		String str = "prasanna.kumar@gmail.com";
		for( i = 0 ; i < str.length() ; i++){
			for( j = 0 ; j < str.length() ; j++){
				if( str.charAt( i ) == str.charAt( j )){
					count++;
				}
			}
			System.out.println(str.charAt(i)+"__"+ count );
			String s = String.valueOf(str.charAt(i)).trim();
			str = str.replaceAll(s,"");
			count = 0;
		}
	}
} 