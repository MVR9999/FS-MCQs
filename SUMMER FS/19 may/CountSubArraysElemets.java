import java.util.*;
 class CountSubArraysElemets{ 

	public static void cntArray(int A[], int N) 
	{ 
		int result = 0; 
		for (int i = 0; i < N; i++) { 
			result++; 
			int current_value = A[i]; 
			for (int j = i + 1; j < N; j++) { 
				if (A[j] == current_value) 
					result++; 
			} 
		} 
	System.out.println(result); 
	} 
  	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		cntArray(a,n); 
	} 
} 
