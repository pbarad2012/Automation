package MavenProject.Testing;

public class Array {

	public static void main(String[] args) {
		
		int a2[] = new int[5];
		
		a2[0] = 000;
		a2[1] = 111;
		a2[2] = 222;
		a2[3] = 333;
		a2[4] = 444;
		
		
		System.out.println(a2.length);
		
		for(int i=0;i<a2.length;i++) {
			System.out.println(a2[i]);
			
		}
		
		int a[] = {10,20,30,40,50,60,70};

		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		

	}

}
