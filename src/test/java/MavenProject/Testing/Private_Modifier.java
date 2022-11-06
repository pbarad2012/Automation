package MavenProject.Testing;


class Private{
	
	private void info() {
		
		System.out.println("Private Method");
	}
	
}

public class Private_Modifier {

	public static void main(String[] args) {
		Private test1 = new Private();
		test1.info();

	}

}
