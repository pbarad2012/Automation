package MavenProject.Testing;


abstract class Bank{    
abstract int getRateOfInterest(); 

}    

class SBI extends Bank{    
	int getRateOfInterest(){
			return 7;
	}    
}    

class PNB extends Bank{    
int getRateOfInterest(){
	return 8;
	
}    
}    
    
class Abstraction{    
public static void main(String args[]){    
	
	SBI test1 = new SBI();
	PNB test2 = new PNB();	
	  
System.out.println("Rate of Interest is: "+test1.getRateOfInterest()+" %");    
System.out.println("Rate of Interest is: "+test2.getRateOfInterest()+" %");    
}}    
