import java.util.*;
class P3
 {
	public static void main (String[] args) 
	 {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++) 
				arr[i] = sc.nextInt();
            
            Deque<Integer> dq = new LinkedList<>();
            for (int i=0; i<k; i++)
            {
                while (!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]) dq.removeLast();
                dq.addLast(i);
            }
            
            for (int i=k; i<n; i++)
            {
                System.out.print(arr[dq.peekFirst()] + " ");
                while (!dq.isEmpty() && dq.peekFirst()<=i-k) 
					dq.removeFirst();
                while (!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]) dq.removeLast();
					dq.addLast(i);
            }
            
            System.out.print(arr[dq.peekFirst()] + "\n");
	     }
	
}