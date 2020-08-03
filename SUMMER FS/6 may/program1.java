import java.util.*;
class equalstacks
{
	public static int equalStacks(int[] h1, int[] h2, int[] h3) {
	   int totalh1=0;
	   int totalh2=0;
	   int totalh3=0;
	   
	   for(int x : h1){ totalh1+=x;}
	   for(int y : h2){ totalh2+=y;}
	   for(int z : h3){ totalh3+=z;}

		int i1=0;
		int i2=0;
		int i3=0;

		while(i1<h1.length && i2<h2.length && i3<h3.length){
			if(totalh1==totalh2 && totalh1==totalh3 && totalh2==totalh3){
				return totalh1;
			}
			else{
				if(totalh1>=totalh2 && totalh1>=totalh3){
					totalh1-=h1[i1];
					i1++;
				}else if(totalh2>=totalh1 && totalh2>=totalh3){
					totalh2-=h2[i2];
					i2++;
				}else if(totalh3>=totalh2 && totalh3>=totalh1){
					totalh3-=h3[i3];
					i3++;
				}
			}
		}
		return 0;
    }


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		int[] arr3 = new int[n3];
		for (int i = 0; i < n1; i++) 
			arr1[i] = sc.nextInt();
		for (int i = 0; i < n2; i++) 
			arr2[i] = sc.nextInt();
		for (int i = 0; i < n3; i++) 
			arr3[i] = sc.nextInt();
		
		System.out.println(equalStacks(arr1,arr2,arr3));

	}
}
