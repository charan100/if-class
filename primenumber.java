class Prime{
	public static void main(String[] args){
		int i,m = 0,flag = 0;
		int n = 17;
		m = n/2;
		//m = n;
		for(i=1;i<=m;i++){
			if(n%i==0){
				System.out.println("num is not prime");
				flag = 1;
				break;
			}
		}
		if(flag==0)
			System.out.println("prime num");
	}
}