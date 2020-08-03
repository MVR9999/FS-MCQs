import java.util.*; 
import java.util.Arrays; 
import java.util.Collections;

class SexyPrime { 
	static boolean[] Prime; 

	static void computePrime(int N) { 
		// Resize the Prime Number 
		Prime = new boolean[N + 1]; 
		Arrays.fill(Prime, true); 
		Prime[0] = Prime[1] = false; 

		// Loop till Math.sqrt(N) to find prime numbers and make their 
		// multiple false in the bool array Prime 
		for (int i = 2; i * i <= N; i++) { 
			if (Prime[i]) { 
				for (int j = i * i; j < N; j += i) { 
					Prime[j] = false; 
				} 
			} 
		} 
	} 

	static int countSexyPairs(int arr[], int n) 
	{ 
		// Find the maximum element in the given array arr[] 
    int maxE = arr[0];
    for (int i = 1; i <arr.length; i++) {
      if(arr[i] > maxE)
          maxE = arr[i];        
    }
		computePrime(maxE); 

		// To store the count of pairs 
		int count = 0; 

		// To store the frequency of element in the array arr[] 
		int freq[] = new int[maxE + 1]; 

		for (int i = 0; i < n; i++) { 
			freq[arr[i]]++; 
		} 

		// Sort before traversing the array 
		Arrays.sort(arr); 

		// Traverse the array and find the pairs with SPP (Sexy Prime Pair) 
		for (int i = 0; i < n; i++) { 

			// If current element is Prime, then check for 
      (current element + 6) 
			if (Prime[arr[i]]) { 
				if (arr[i] + 6 < freq.length 
					&& freq[arr[i] + 6] > 0
					&& Prime[arr[i] + 6]) { 
					count++; 
				} 
			} 
		} 

		// Return the count of pairs 
		return count; 
	} 


	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.print(countSexyPairs(arr, n)); 
	} 
} 
