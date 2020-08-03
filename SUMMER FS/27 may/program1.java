import java.util.*;
import java.util.stream.Collectors;
class program1 
{
	public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        k %= m * n;
        reverse(grid, 0, m * n - 1);
        reverse(grid, 0, k - 1);
        reverse(grid, k, m * n - 1);
        List<List<Integer>> ans = new ArrayList<>();
        for (int[] row : grid)
            ans.add(Arrays.stream(row).boxed().collect(Collectors.toList()));
        return ans;
    }
    public static void reverse(int[][] g, int lo, int hi) {
        int m = g.length, n = g[0].length;
        while (lo < hi) {
            int r = lo / n, c = lo++ % n, i = hi / n, j = hi-- % n, 
            tmp = g[r][c];
            g[r][c] = g[i][j];
            g[i][j] = tmp;
        }
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] mat=new int[m][n];
		for (int i=0; i<m;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				mat[i][j]=sc.nextInt();
			}
		}
		int k=sc.nextInt();

		System.out.println(shiftGrid(mat,k));
	}
}

/*
Imagine the grid to be a 1-D array of size m * n;
reverse the whole array;
reverse the first k elements
reverse the remaing m * n - k element.
*/