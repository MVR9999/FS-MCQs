
import java.util.*;

class Pair
{
    int x,y,d;
    Pair(int x,int y,int d)
    {
        this.x=x;
        this.y=y;
        this.d=d;
    }
}
class Test2 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);

		    Queue<Pair> q=new LinkedList<>();
		    int r=sc.nextInt();
		    int c=sc.nextInt();
		    int grid[][]=new int[r][c];
		    for(int i=0;i<r;i++){
		     for(int j=0;j<c;j++){
		        grid[i][j]=sc.nextInt();
		         if(grid[i][j]==2)
		            q.add(new Pair(i,j,0));
		        }
		    }
		     int x[]={-1,1,0,0};
		     int y[]={0,0,1,-1};
		     int time=0;
		    while(q.size()>0)
		    {
		        Pair cp=q.poll();
		        time=Math.max(time,cp.d);
		        for(int i=0;i<4;i++)
		        {
		            int nx=cp.x+x[i];
		            int ny=cp.y+y[i];
		            if(issafe(nx,ny,grid))
		            {
		                grid[nx][ny]=2;
		                Pair np=new Pair(nx,ny,cp.d+1);
		                q.add(np);
		            }
		        }
		    }
		    int flag=0;
		    for(int i=0;i<r;i++){
		      for(int j=0;j<c;j++){
		         if(grid[i][j]==1){
		              flag=1;
		              break;
		             
		         }
		      }
		    }
		  if(flag==1)  
		  System.out.println("-1");
		  else
		  System.out.println(time);
		
	}
	public static boolean issafe(int x,int y,int grid[][])
	{
	    return (x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]==1);
	}
}