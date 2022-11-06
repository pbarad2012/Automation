package MavenProject.Testing;

class BankAccount{  
void total_amount(){System.out.println("Parent BankAccount");}  
}  

class Saving extends BankAccount{  
void saving_amount(){System.out.println("Saving Account");}  
}  


class Current extends BankAccount{  
void current_amount(){System.out.println("Current Account");}  
}  


class TestInheritance2{  
public static void main(String args[]){  
	Saving s=new Saving();  
	s.saving_amount();
	s.total_amount();
	Current c = new Current();
	c.current_amount();
	c.total_amount();
	

}}  