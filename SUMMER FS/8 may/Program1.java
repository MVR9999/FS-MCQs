import java.util.*;
class program1 
{
	public static int minEatingSpeed(int[] piles,int H){
		int left=1;
		int right=Arrays.stream(piles).max().getAsInt();
		while(left <= right){
			int mid=left +(right-left)/2;
			if(canEatInTime(piles,mid,H)){
				right=mid-1;
			}
			else{
				left =mid+1;
			}
		}
		return left;
	}

	public static boolean canEatInTime(int[] piles, int k, int h){
		int hours=0;
		for (int pile:piles){
			int div=pile / k;
			hours+=div;
			if(pile %k !=0) ++hours;
		}
		return hours <=h;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] piles=new int[n];

		for (int i=0; i<n;i++ )
			piles[i]=sc.nextInt();
		int H=sc.nextInt();

		System.out.println(minEatingSpeed(piles , H));
	}
}
