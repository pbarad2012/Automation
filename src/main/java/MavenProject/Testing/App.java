package MavenProject.Testing;

class App 
{
    public static void main( String[] args )
    {
    	String name = "Hello Prakash Barad";
    	int number = 123456789;
    	float dec_no = (float) 125464.45;
    	char c1 = 'd';
    	boolean myBool = false;
    	String firstName = "User1";
    	String lastName = "User1_lastname";
    	
    	
    	System.out.println(name);
    	System.out.println(number);
    	System.out.println(dec_no);
    	System.out.println(c1);
    	System.out.println("*********************************************************************");
    	
//    	String Functions
    	
    	System.out.println(name.length());
    	System.out.println("*********************************************************************");
    	System.out.println(name.toLowerCase());
    	System.out.println(name.toUpperCase());
    	System.out.println("*********************************************************************");
    	System.out.println(firstName + " " + lastName);
    	System.out.println(firstName.concat(" ").concat(lastName));
    	System.out.println("*********************************************************************");
    	System.out.println(name.contains("Hello"));
    	System.out.println(name.contains("sdsds"));
    	System.out.println("*********************************************************************");
    	System.out.println(name.startsWith("Prakash"));
    	System.out.println(name.endsWith("Barad"));
    	System.out.println("*********************************************************************");
    	int a = 10;
    	int b = 20;
    	String a1 = "10";
    	String a2 = "20";
    	System.out.println(a + b);
    	System.out.println(a1 + b);
    	System.out.println(a1 + a2);
    	
    	System.out.println("*********************************************************************");
    	System.out.println(name.substring(6));
    	System.out.println(name.substring(6,13));
    	System.out.println("*********************************************************************");
    	String s1 = "Hello";
    	String s2 = "Hello";
    	System.out.println(s1.compareTo(s2));
    	System.out.println("*********************************************************************");
    	System.out.println("User name is" + ":"+ name);
    	System.out.println("*********************************************************************");
    	System.out.println(name.replace('a', 'p'));
    	
    	char ch=name.charAt(1);
    	System.out.println(ch);
    	
    	
    }
}
