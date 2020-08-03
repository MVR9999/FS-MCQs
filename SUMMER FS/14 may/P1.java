

import java.util.*;

class P1 
	{
	public static void main (String[] args) {

		Scanner s=new Scanner(System.in);
		
		    String str=s.nextLine();
		    int count=0,max=0;

		    Set<Character> set=new HashSet<Character>();
		    Queue<Character> q=new LinkedList<Character>();
		    for(int i=0;i<str.length();i++)
		    {
		        if(set.contains(str.charAt(i))==false){
		        set.add(str.charAt(i));
		        q.add(str.charAt(i));
		        if(q.size()>max)
		        max=q.size();
		        }
		        else{
		            
		            while(q.isEmpty()==false)
		            {
		                char x=q.remove();
		                set.remove(x);
		                if(x==str.charAt(i))break;
		            }
		            set.add(str.charAt(i));
		            q.add(str.charAt(i));
		            if(q.size()>max)
		            max=q.size();
		            
		        }
		}
		System.out.println(max);
		
	}
}