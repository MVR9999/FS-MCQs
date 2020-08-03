import java.util.*;
class CountWays 
{
static void countWays(int n) 
{ 
    if (n <= 2) 
        System.out.println("-1"); 
  
    else { 
        int ans = (n - 1) * (n - 2) / 2; 
        System.out.println(ans); 
    } 
} 
  
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		countWays(n);
	}
}
