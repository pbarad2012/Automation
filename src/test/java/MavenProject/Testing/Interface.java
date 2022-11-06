package MavenProject.Testing;

interface A1{
	
	public static final int i = 5;
	public abstract void info();
}


class Interface implements A1{

	@Override
	public void info() {
		System.out.println("Interface method");
		
	}
	  
public static void main(String args[]){  
	Interface  obj = new Interface ();  
	obj.info();
 }  
} 