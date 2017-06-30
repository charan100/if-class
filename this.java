class Student{
	int id;
	String name;
	float fee;
	Student(int id,String name){
	//Student(int id,String name,float fee){  //current class variable
		this.id = id;
		this.name = name;
		//this.fee = fee;
	}
	Student(int id,String name,float fee){
		this(id,name);  //reuse the constructor   //call to this() must be first statement in constructor
		this.fee = fee;
	}
	void display(){
		System.out.println(id+" "+name+" "+fee);
	}
	class TestThis{
		public static void main(String[] args){
			Student s1 = new Student(1,"charan",5000f);
			Student s2 = new Student(2,"shivaji",6000f);
			s1.display();
			s2.display();
		}
	}
}