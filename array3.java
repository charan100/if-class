class Testarray{
	public static void main(String[] args){
		//declararing and initializing 2D array
		int arr[][] = {{1,2,3},{2,4,5},{4,4,5}};
		//printing 2D array
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(arr[i][j]+" ");
			}
			System.out.println( );
		}
	}
}