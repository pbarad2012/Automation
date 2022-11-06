package MavenProject.Testing;



class Student_Info{  
	
    int id;  
    String name;  
    static String college = "abc";  
    
    //static method to change the value of static variable  
    static void change(){  
    	college = "xyz";  
    }  
    
    //constructor to initialize the variable  
    Student_Info(int r, String n){  
    	id = r;  
    	name = n;  
    }  
    
    //method to display values  
    void display(){System.out.println(id+" "+name+" "+college);}  
}  
//Test class to create and display the values of object  
public class TestStaticMethod{  
   public static void main(String args[]){  
	   
	   Student_Info.change(); //calling change method  // call static method without creating object
   //creating objects  
	   Student_Info s1 = new Student_Info(1,"P1");  
	   Student_Info s2 = new Student_Info(2,"p2");  
	   Student_Info s3 = new Student_Info(3,"p3");  
   //calling display method  
	   
	   s1.display();  
	   s2.display();  
	   s3.display();
	}

}
