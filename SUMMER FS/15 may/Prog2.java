import java.util.*;
class Prog2
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    	    
	        int n = sc.nextInt();  
	        Map<Integer, Integer> m = new HashMap<>();
	        int sum = 0, count = 0;
	        m.put(0, 1);
	        
	        for(int i = 0; i < n; ++i) {
	            
	            int x = sc.nextInt();
	            
	            sum += x;
	                
	           count += m.getOrDefault(sum , 0);
	           int num = m.getOrDefault(sum , 0) + 1;
	           m.put(sum, num);
	        }
	        System.out.println(count);
	     
	    
	 }
}