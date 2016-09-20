
public class Addition {

	
	public static void main(String[] args) {
		int x=60,y=13;
		
		
	    System.out.print("Sum of "+x+" and "+y+" is:");
		    while (y != 0)
		    {
		    	
		        int carry = x & y; 
		        
		        x = x ^ y; 		        
		        y = carry << 1;
		       
		        
		    }
		    System.out.println(x);
		    
		}

	

}
