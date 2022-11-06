package MavenProject.Testing;

class Student6{  

	int id;
	String name;

    Student6(int i, String n){  
    	id = i;
    	name = n;
    
    } 
    
    
    void display(){
    	
    	System.out.println(id + " " + name);
    
    }  
}

public class ConstructorsExample_2 {

	public static void main(String[] args) {
		Student6 test6 = new Student6(1234,"Prakash");
		Student6 test7 = new Student6(23344,"Barad");
		test6.display();
		test7.display();
	}

}
