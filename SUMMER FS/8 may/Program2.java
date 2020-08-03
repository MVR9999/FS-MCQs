import java.io.*;
import java.util.*;
class Program2 {
	public static StringBuilder mString(StringBuilder a,StringBuilder b)
	{
		StringBuilder answer = new StringBuilder("");
		int i = 0;
		int j = 0;
		while (a.charAt(i) != '~' || b.charAt(j) != '~'){
			if (a.charAt(i) != '~' && a.charAt(i) < b.charAt(j)){
				answer.append( a.charAt(i));
				 i += 1;
			}
			else{
				answer.append(b.charAt(j));
				j += 1;
			}
		
		}
		return answer;
	}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder s1 = new StringBuilder(input.next()); s1.append("~");//Denote end
        StringBuilder s2 = new StringBuilder(input.next()); s2.append("~");//Denote end
		System.out.println(mString(s1,s2));
    }
}
