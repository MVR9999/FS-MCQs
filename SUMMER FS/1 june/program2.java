

import java.util.*;

class  program2
{
	public static int countSubsequences(int arr[], int n, int k) { 
	int countOdd = 0; 

	// counting odd numbers in the array 
	for (int i = 0; i < n; i++) { 
		if ((arr[i] & 1)==1) 
			countOdd++; 
	} 
	int ans = nCr(n, k) 
			- nCr(countOdd, k); 
	return ans; 
	} 

	public static int nCr(int n, int r) 
	{ 
		if (r > n) 
			return 0; 
	return fact(n) / (fact(r) * fact(n - r)); 
	} 

	public static int fact(int n) 
	{ 
	int res = 1; 
	for (int i = 2; i <= n; i++) 
		res = res * i; 
	return res; 
	} 


	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];

		for (int i=0;i<size ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(countSubsequences(arr, size, k));  
	}
}


