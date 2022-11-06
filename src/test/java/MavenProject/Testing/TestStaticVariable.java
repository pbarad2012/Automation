package MavenProject.Testing;


class counter1{
	int counter_1 = 0;
	static int counter_2 = 0;
	
	counter1(){
		counter_1++;
		counter_2++;
		System.out.println(counter_1+ " " + counter_2);
		
	}
	
}

//class Counter2{  
//static int count=0;//will get memory only once and retain its value  
//  
//Counter2(){  
//count++;//incrementing the value of static variable  
//System.out.println(count);  
//}  
//  
//}

public class TestStaticVariable {

	public static void main(String[] args) {
		counter1 test1 = new counter1();
		counter1 test2 = new counter1();
		counter1 test3 = new counter1();
		counter1 test4 = new counter1();
		
		
	}

}
