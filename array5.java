class Testarraycopy{
	public static void main(String[] args){
		char[] copyFrom = {'a','m','c','h','a','r','a','n','m','a','a'};
		char[]copyTo = new char[7];
		System.arraycopy(copyFrom,2,copyTo,0,7);
		System.out.println(new String(copyTo));
	}
}