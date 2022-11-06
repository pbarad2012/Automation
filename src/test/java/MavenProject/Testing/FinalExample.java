package MavenProject.Testing;


final class Student8{
	
	final int id = 1234;
	
	final void info() {
		System.out.println("Info Final");
		
	}
	
}

public class FinalExample extends Student8{
	
	void info() {
		System.out.println("Info Final - Child");
		
	}
	
	public static void main(String[] args) {
		FinalExample test8 = new FinalExample();
//		test8.id = 3456;
		test8.info();
		System.out.println(test8.id);

	}

}
