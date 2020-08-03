import java.util.*;
import java.util.stream.Collectors; 
class program2 
{
	public static List<Integer> transformArray(int[] arr) {
        int[] ans = new int[arr.length];
        while (!Arrays.equals(ans, arr)) {
            ans = arr.clone();
            for (int i = 1; i < arr.length - 1; ++i) {
                if (ans[i - 1] < ans[i] && ans[i] > ans[i + 1]) {
                    --arr[i];
                }else if ( ans[i - 1] > ans[i] && ans[i] < ans[i + 1]) {
                    ++arr[i];
                }
            }
        }
        return  Arrays.stream(ans).boxed().collect(Collectors.toList());
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
		List<Integer> l=transformArray(arr);
		for (int i :l )
			System.out.print(i+" ");
	}
}
