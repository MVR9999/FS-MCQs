import java.util.*;

public class GetCoinsWays {

    static long getWays(long n, long[] coins){
        int m=coins.length;
        long table[][]=new long[(int)n+1][m];
        for(int i=0;i<m;i++)
            table[0][i]=1;
        for(int i=1;i<n+1;i++){
            for(int j=0;j<m;j++){
                long x=0,y=0;
                if(i-(int)coins[j]>=0){           
                    x=table[i-(int)coins[j]][j];
                }
                if(j-1>=0)
                    y=table[i][j-1];
                table[i][j]=x+y;
            }
        }
       return table[(int)n][(int)m-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}