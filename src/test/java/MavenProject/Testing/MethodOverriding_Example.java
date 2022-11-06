package MavenProject.Testing;


class Parent {
	
	public void info() {
		
		System.out.println("Parent");
	}
	
}
public class MethodOverriding_Example extends Parent {
	
	public void info() {
		
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		MethodOverriding_Example test1 = new MethodOverriding_Example();
		test1.info();

	}

}
