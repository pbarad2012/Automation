package MavenProject.Testing;


class ABC{
	
	void minim(int a1[]) { 
		int min = a1[0];
		for(int i=1;i<a1.length;i++) { 
			
			if(min > a1[i]) { 
				
				min = a1[i];
			}
			
			 
		}
		System.out.println(min);
		
	}
}



class Testarray2 {  
	//creating a method which receives an array as a parameter   
	  
	public static void main(String args[]){  
		int a[]={33,3,4,5};//declaring and initializing an array  
		ABC a1 = new ABC();
		a1.minim(a);
	}}  