class For{
	public static void main(String[] args){
		aa:
		for(int i=1;i<=10;i++){
			bb:
			for(int j=1;j<=3;j++){
				if(i==2&&j==2){
					break bb; //default
				}
					System.out.println(i+" "+j);
			}
		}
		//for(;){
			//System.out.println("infinite loop");
		//}
		//int arr[]={22,23,24,25,26};
		//for(int i:arr){
			//System.out.println(i);
		//}
		//int i;
		//for(i=1;i<=10;i++){
			//System.out.println(i);
		//}
	}
}