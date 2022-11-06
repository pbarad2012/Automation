package MavenProject.Testing;

public class If {
    public static void main( String[] args )
    {
    
        
    	int password = 12345789;
    	
    	if(password == 123457889) {
    		System.out.println("Login");
    		
    	}
    	else{
    		System.out.println("Password is worng");
    		
    	}
    	
    	
        int number=16;  
        //Check if the number is divisible by 2 or not  
        if(number%2==0){  
            System.out.println("even number");  
        }else{  
            System.out.println("odd number");  
        }  
     
    	int number_1 = 0;
    	if(number_1 > 0) {
    		System.out.println("Positive");
    	}
    	else if(number_1 < 0) {
    		
    		System.out.println("Negative");
    	}
    	else {
    		System.out.println("Zero");
    		
    	}
    	
       
        if(number>0){  
        System.out.println("POSITIVE");  
        }else if(number<0){  
        System.out.println("NEGATIVE");  
        }else{  
        System.out.println("ZERO");  
       } 
//        
        
        int age=20;  
        int weight=80;    
        if(age>=18){    
            if(weight>50){  
                System.out.println("You are eligible to donate blood");  
            }    
        }   
//            
//        
//        
        if(age>=18){      
            if(weight>50){    
                System.out.println("You are eligible to donate blood");    
            } else{  
                System.out.println("You are not eligible to donate blood");    
            }  
        } else{  
          System.out.println("Age must be greater than 18");  
        }  
        
        
        
        
    
    	int age_1 = 19;
    	int w = 45;
    	
    	if(age_1 > 18 && w > 50) {
    		
    		System.out.println("Donate blood");
    		
    	}
    	else {
    		System.out.println("Age is small");
    		
    	}
        
        
        
        
        
        
}
    
    
}
    

