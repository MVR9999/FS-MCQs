import java.util.*;
class  program3
{
	public static int missingNumber(int[] A) {
        int first = A[0], last = A[0], sum = 0, n = A.length;
        for (int a : A) {
            first = Math.min(first, a);
            last = Math.max(last, a);
            sum += a;
        }
        return (first + last) * (n + 1) / 2 - sum;
    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for (int i=0;i<size ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(missingNumber(arr));
	}
}

/*
 Arithmetic Sequence Sum
arithmetic sequence sum = (first + last) * n / 2
In this problem, the first and last value are not removed.
first = min(A), last = max(A)
We can calulate the sum of arithmetic sequence.
The difference between sum - sum(A) is the missing number.

*/
