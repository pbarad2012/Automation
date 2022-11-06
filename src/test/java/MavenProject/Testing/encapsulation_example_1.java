package MavenProject.Testing;

class Info_1{  
	//private data member  
	private String name = "Read Only";  
	
	//getter method for name  
	public String getName(){  
	return name;  
	}  
	 
	} 


public class encapsulation_example_1 {

	public static void main(String[] args) {
		//creating instance of the encapsulated class  
		Info_1 s=new Info_1();  
		//setting value in the name member  
		s.setName("Prakash");  
		//getting value of the name member  
		System.out.println(s.getName()); 

	}

}
