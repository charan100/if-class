class Style
	{  
	int id;  
	String name;  
	int age;  
	Style(int i,String n)
		{  
		id = i;  
		name = n;  
		}  
		Style(int i,String n,int a)
			{  
			id = i;  
			name = n;  
			age=a;  
			}  
		void display()
		{
		System.out.println(id+" "+name+" "+age);
		}  
   
		public static void main(String args[])
		{  
		Style s1 = new Style(1,"CHARAN");  
		Style s2 = new Style(2,"PRAKASH",55);  
		s1.display();  
		s2.display();  
		}  
	}	  