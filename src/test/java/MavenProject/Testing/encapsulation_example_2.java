package MavenProject.Testing;

class Info_2{  
	//private data member  
	private String name;  
	
	//setter method for name  
	public void setName(String name){  
			this.name=name;
	}  
	} 


public class encapsulation_example_2 {

	public static void main(String[] args) {
		//creating instance of the encapsulated class  
		Info_2 s=new Info_2();  
		//setting value in the name member  
		s.setName("Prakash");  
		//getting value of the name member  
		System.out.println(s.getName()); 

	}

}
