import java.util.*;

class Prog3 {
  
    public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
			
			int k = scn.nextInt();
			int n = scn.nextInt();
			
			ArrayList<Integer> list = new ArrayList<>();
			PriorityQueue<Integer> heap = new PriorityQueue<>();

			for(int i=0;i<n;i++) {
				
				list.add(i, scn.nextInt());
				
				if(list.size()<k)
        		{
        		    heap.add(list.get(i));
				    System.out.print(-1 + " ");
        			continue;
        		}
				
				if(i<k)
				    heap.add(list.get(i));
				else{
				    int hp = heap.peek();
                    if (list.get(i) > hp) {
        				heap.remove();
        				heap.add(list.get(i));
			    	}
        	    }
        	    System.out.print(heap.peek() + " ");
			
		}
		System.out.println();
	
}		

}
