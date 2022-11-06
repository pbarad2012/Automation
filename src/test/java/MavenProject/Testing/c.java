package MavenProject.Testing;

class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome");}  
}  
class c extends A,B
{ 
 public static void main(String args[]){  
   c obj=new c();  
   obj.msg(); 
}  
}  