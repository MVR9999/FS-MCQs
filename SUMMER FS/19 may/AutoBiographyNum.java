import java.util.*;
class   AutoBiographyNum
{

static boolean isAutoBiographyNum(int number) 
{ 

	int count = 0, position, size, digit; 
	String NUM; 

	// Convert integer to string 
	NUM = ""+number; 
	size = NUM.length(); 

	for (int i = 0; i < size; i++) { 
		position = NUM.charAt(i) - '0'; 
		count = 0; 

		for (int j = 0; j < size; j++) { 
			digit = NUM.charAt(j) - '0'; 
			if (digit == i) 
				count++; 
		} 

		if (position != count) 
			return false; 
	} 

	return true; 
} 

static int checkArray(int arr[], int n) 
{ 

	int current_length = 0; 
	int max_length = 0; 

	for (int i = 0; i < n; i++) { 

		if (isAutoBiographyNum(arr[i])) 
			current_length++; 
		else
			current_length = 0; 
		max_length = max_length>current_length ? max_length : current_length; 
	} 

	// Return the final result 
	return max_length; 
} 



	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
       	       System.out.println(checkArray(a, n)); 
	}
}
