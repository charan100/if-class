class Rectangle{
	int length;
	int width;
	void insert(int l,int w){
		length = l;
		width = w;
	}
	void CalculationArea(){
		System.out.println(length*width);
	}
}
	class TestRectangle1{
		public static void main(String[] args){
			Rectangle r1 = new Rectangle(),Rectangle r2 = new Rectangle();
			r1.insert(3,15);
			r2.insert(11,5);
			r1.CalculationArea();
			r2.CalculationArea();
		}
	}
	