
import java.util.*;

class Test1 {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	   int size=sc.nextInt();
	   int arr[]=new int[size];
	   for(int q=0;q<size;q++)
	       arr[q]=sc.nextInt();
	   int l[]=new int[size];
	   int r[]=new int[size];
	   int s=arr[0];
	   l[0]=arr[0];
	   for(int i=0;i<size;i++){
	       if(arr[i]>=s){
	          s=arr[i];
	           l[i]=s;
	       }
	       else
	       l[i]=s;
	    }
	    s=arr[size-1];
	    for(int w=size-1;w>=0;w--){
	      if(arr[w]<=s){
	          s=arr[w];
	          r[w]=s;
	      } 
	      else
	      r[w]=s;
	   }
	   int k=0;
	   for(k=0;k<size;k++){
	       if(l[k]==r[k]&&k!=0&&k!=size-1){
	           System.out.print(l[k]);
	           break;
	       }
	   }
	   if(k==size)
	   System.out.print(-1);
	   System.out.println();

	}
}