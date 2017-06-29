class Student2{
	int id;
	String name;
	static String college = "KMM";
	//static void change(){
		//college = "CBIT";
	//}
	Student2 (int i,String n){
		id = i;
		name = n;
	}
	void display(){
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args){
		//Student2.change();
		Student2 s1 = new Student2(1,"charan");
		Student2 s2 = new Student2(2,"shivaji");
		s1.display();
		s2.display();
	}
}