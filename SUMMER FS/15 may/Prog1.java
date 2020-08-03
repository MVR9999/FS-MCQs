import java.util.*;
class Prog1
 {
     public static void main (String[] args)
	 {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]=new int[n];
	      Map<Integer,Integer> m=new HashMap<>();
	      for(int i=0;i<n;i++)
	      {
	          arr[i]=sc.nextInt();
	          if(m.containsKey(arr[i]))
	          m.put(arr[i],m.get(arr[i])+1);
	          else
	          m.put(arr[i],1);
	      }
	      
	      int max=0;
	      for(int i=0;i<n-1;i++)
	      {
	          for(int j=i+1;j<n;j++)
	          {
	               if(m.get(arr[i])<m.get(arr[j]) ||(m.get(arr[i])==m.get(arr[j]) && arr[i]>arr[j]))
	               {
	                   int temp=arr[i];
	                   arr[i]=arr[j];
	                   arr[j]=temp;
	               }
	               
	          }
	      }
	      
	      for(int i=0;i<n;i++)
	      System.out.print(arr[i]+" ");
	      
	      System.out.println();
	  }
 }