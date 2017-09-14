
class Student{  
	int rollno;  
	String name;  
	static String college = "svit";  
       
	static void change(){  
		college = "kmm";  
	}  
  
		Student(int r, String n)
		{  
			rollno = r;  
			name = n;  
		}  
  
		void display ()
		{
			System.out.println(rollno+" "+name+" "+college);
		}  
  
		public static void main(String args[])
		{  
			Student.change();  
			Student s1 = new Student (1,"charan");  
			Student s2 = new Student (2,"mahesh");  
			Student s3 = new Student (3,"Sunny");  
			s1.display();  
			s2.display();  
			s3.display();  
		}  
}  