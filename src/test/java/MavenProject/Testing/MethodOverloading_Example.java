package MavenProject.Testing;


class add_numbers{
	
	public int add_number(int a, int b) {

		return a +b ;
	}
	
	public int add_number(int a, int b,int c) {
		return a + b + c ;
	}
	
}
public class MethodOverloading_Example {

	public static void main(String[] args) {
		add_numbers test1 = new add_numbers();
		System.out.println(test1.add_number(12, 12));
		System.out.println(test1.add_number(12, 12, 12));

	}

}
