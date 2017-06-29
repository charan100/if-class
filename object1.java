class Student{    //creat class unsing in another class
	int id;
	String name;
	float salary;
	void insertRecord(int i,String n,float s){    //insertRecord method
		id = i;
		name = n;
		salary = s;   //storing employee detais
	}
		void displayinformation(){    //displayinformation method
		System.out.println(id+" "+name+" "+salary);
	}
}

	class Teststudent1{   
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();  //creating multiple objects
		s1.insertRecord(12,"charan",4000);
		s2.insertRecord(13,"shivaji",3000);
		s1.displayinformation();
		s2.displayinformation();
		//s1.id = 12;
		//s1.name =  "charan";
		//s2.id = 13;
		//s2.name = "shivaji";
		//System.out.println(s1.id+" "+s1.name);
		//System.out.println(s2.id+" "+s2.name);
		//System.out.println(s1.id);
		//System.out.println(s1.name);
	}
}