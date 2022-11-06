package MavenProject.Testing;


class Student5{  

    Student5(){  
    	System.out.println("Constructor Method");
    
    } 
    
    
    void display(){
    	
    	System.out.println("Class Method");
    
    }  
}


public class ConstructorsExample {

	public static void main(String[] args) {
		
		Student5 test5 = new Student5(); // Constructor Called here
		test5.display();

	}

}
