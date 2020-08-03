import java.util.*;

class Test3 {
		public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	        charIgnore(s.toCharArray()); 
	 }
		
		
    static void charIgnore(char c[])
    {
        HashSet<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        
        for(int i=0;i<c.length;i++)
        {
            if(!set.contains(c[i]))
            {
                sb.append(c[i]);
                set.add(Character.toLowerCase(c[i])); //Add both capital and small letter.
                set.add(Character.toUpperCase(c[i]));
            }
            
            else 
            {
            set.remove(Character.toLowerCase(c[i]));
            set.remove(Character.toUpperCase(c[i]));
            }
        }
        
        System.out.println(sb);
    }
    
}