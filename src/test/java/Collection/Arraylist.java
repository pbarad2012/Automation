package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
		//Creating arraylist   
		
		  ArrayList<String> list=new ArrayList<String>(); 
		  
		//Adding object in arraylist    
		  
	      list.add("Person1");
	      list.add("Person2");    
	      list.add("Person3");    
	      list.add("Person4");    
	      
	      //Printing the arraylist object   
	      System.out.println(list);  
	      
	      
	    //getting the Iterator
	      Iterator itr=list.iterator();  
	      
	      //check if iterator has the elements  
	      while(itr.hasNext()){
	    
	    	  	System.out.println(itr.next());
	      }  
	      
	      System.out.println("Returning element: "+list.get(1));
	      list.set(1,"Person5");  
	      
	      Collections.sort(list);  
	      
	      System.out.println(list);  
	}

}
