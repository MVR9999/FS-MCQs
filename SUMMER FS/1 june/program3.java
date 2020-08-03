import java.util.*; 
class program3
{ 
	public static void printFirstNegativeInteger(int arr[], int n, int k) 
	{ 
		boolean flag; 
		for (int i = 0; i<(n-k+1); i++)		 
		{ 
			flag = false; 
			for (int j = 0; j<k; j++) 
			{ 
				if (arr[i+j] < 0) 
				{ 
					System.out.print((arr[i+j])+" "); 
					flag = true; 
					break; 
				} 
			} 
			if (!flag) 
				System.out.print("0"+" "); 
		} 
	} 

public static void main(String args[]) 
{ 
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] arr=new int[size];
	for (int i=0;i<size ;i++ )
	   arr[i]=sc.nextInt();
	int k = sc.nextInt(); 
	printFirstNegativeInteger(arr, size, k); 
	
} 
}
