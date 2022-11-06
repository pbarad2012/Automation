package MavenProject.Testing;

class Student7{
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}



public class encapsulation_example {

	public static void main(String[] args) {
		//creating instance of the encapsulated class  
		Student7 test7 = new Student7();
		//setting value in the name member  
		test7.setName("Prakash");
		//getting value of the name member  
		System.out.println(test7.getName()); 

	}

}
