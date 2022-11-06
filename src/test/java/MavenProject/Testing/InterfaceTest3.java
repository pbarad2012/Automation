package MavenProject.Testing;


interface Test1{
	
	void info();
}


interface Test2 extends Test1{
	
	
}

public class InterfaceTest3 implements Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

}
