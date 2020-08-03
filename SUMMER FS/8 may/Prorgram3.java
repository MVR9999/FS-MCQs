import java.util.*;

class Program3
{
	public static int rep(String[] words) {
        String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
		HashSet<String> s = new HashSet<>();
        for (String w : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < w.length(); ++i)
                sb.append(d[w.charAt(i) - 'a']);
            s.add(sb.toString());
        }
        return s.size();
    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] words=new String[n];
		for (int i=0;i<n ;i++ )
			words[i]=sc.next();
		System.out.println(rep(words));
	}
}
