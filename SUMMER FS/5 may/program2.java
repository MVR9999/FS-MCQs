
import java.util.*;
class program2
{
	public static String getHint(String secret, String guess) {
    int bulls = 0;
    int cows = 0;
    int[] numbers = new int[10];
    for (int i = 0; i<secret.length(); i++) {
        if (secret.charAt(i) == guess.charAt(i)) bulls++;
        else {
            if (numbers[secret.charAt(i)-'0']++ < 0) cows++;
            if (numbers[guess.charAt(i)-'0']-- > 0) cows++;
        }
    }
    return bulls + "B" + cows + "C";
  }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String secret=sc.next();
		String guess=sc.next();
		System.out.println(getHint(secret,guess));
	}
}
