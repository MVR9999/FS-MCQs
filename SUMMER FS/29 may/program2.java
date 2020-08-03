import java.util.*;
class  program2
{
	 public static int pattern(int N, int K) {
        return Integer.bitCount(K - 1) & 1;
    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();

		System.out.println(pattern(n,k));
	}
}


/*
First, you can easily find that prefix of every row is exactly the same.
It not difficult to understand.
Beacause every 2 * L fisrt letters are generated by the same L fist letters.

Then, we know that every row is the start part of the same long sequence.
Moreover K is guaranteed to be an integer in the range[1, 2 ^ (N - 1)].
So result depends only on value K

Suppose 2^L < K <= 2^(L + 1).
2^L is the biggest 2's power smaller than K.
Kth number is generated from K - 2^L
Kth number is also different from K - 2^L
So we toggle K to K - 2^L by subtracting 2^L

We repeat the process until we toggle K to 1,
which mean we need to substract K - 1 in total.

What we should do is transfer K - 1 in binary,
so that we can easily find how many times we need to toggle.


Example
For example K = 8
we need to substract K - 1 = 7 = 111 in binary.
So we need to substract 100, 10 and 1, which are 4, 2, 1 in decimal.
We toggle K from 8 to 4, 2 and finally 1.

For example K = 9
we need to substract K - 1 = 8 = 1000 in binary.
So we need to substract 1000, which is 8 in decimal.
We toggle K from 9 to 1 directly.


Conclusion
we turn this problem to just count 1 bits.
We can observe that the answer depend on whether the number of 1 bits in binary K - 1 is odd or even.
*/