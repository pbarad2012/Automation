package MavenProject.Testing;


class Student{
	int id = 123;
	String name = "Prakash";
	String school_name;

	
	// Type : 1
	public void get_student_info(){
		System.out.println(id + " " + name);
	}
	
	//Type : 2
	public void get_sum(int a,int b) {
		int sum;
		sum = a + b;
		System.out.println(sum);
		
	}
	
	//Type : 3
	public int get_sum_1(int a,int b) {
		int sum;
		sum = a + b;
		return sum;
		
	}
	
	//Type : 4
	public int get_sum(int a,int b,int c) {
		int sum;
		sum = a + b + c;
		return sum;
		
	}
	
}

class School{
	int school_id;
	String school_location;
	
}

public class Class1 {

	public static void main(String[] args) {
		
		Student o = new Student();
		School o1 = new School();
		o.get_student_info();
		o.get_sum(10, 12);
		o.get_sum(12, 12, 12);
		int total;
		total = o.get_sum_1(12, 12);
		System.out.println(total);
		
		
		}  
			
	}

