class Strings{
	public static void main(String[] args){
		int count = 0 ;
		int i , j ,k;
		int count1 = 0 , count2 = 0;
		String str1 = "prasanna";
		String str2 = "prasanna";
		for( i = 0 ; i <= str1.length() ; i++){
			char currentchar = str1.charAt(i);
			for( j = 0 ; j <= str1.length() ; j++){
				if(currentchar == str1.charAt(j)){
					count1++;
				}
			}
			for( k = 0 ; k <=str2.length() ; k++){
				if(currentchar == str2.charAt(k)){
					count2++;
				}
			}
			if(count1 == count2){
				continue;
			}
			else{
				break;
			}
		}
		if(count1 == count2){
			System.out.println("anagram");
		}
		else{
			System.out.println("not anagram");	
		}
	}
}