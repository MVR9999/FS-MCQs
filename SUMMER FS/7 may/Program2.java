import java.text.ParseException;
import java.util.*;


class CamelCase {
	   public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String s = in.next();
			int count = 0;
			for(int i = 1;i<s.length();i++){
				if(s.charAt(i)<='Z')
					count++;
			}
			System.out.println(count+1);
    }

}
