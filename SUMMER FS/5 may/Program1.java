import java.util.*;
class Program1
{
	public static int smallestCommonElement(int[][] mat) {
		int count[] = new int[10001];
		int n = mat.length, m = mat[0].length;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				++count[mat[i][j]];
			}
		}
		for (int k = 1; k <= 10000; ++k) {
			if (count[k] == n) {
				return k;
			}
		} 
		return -1;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] mat=new int[m][n];
		for (int i=0;i<m ;i++ )
		{
			for (int j=0;j<n;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println(smallestCommonElement(mat));
	}
}
