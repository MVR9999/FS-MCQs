import java.util.*;
class set_mismatch
{
	 public static int[] findErrorNums(int[] nums) {
        Map < Integer, Integer > map = new HashMap();
        int dup = -1, missing = 1;
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2)
                    dup = i;
            } else
                missing = i;
        }
        return new int[]{dup, missing};
    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		int[] res=new int[2];
		for (int i=0;i<n ;i++ )
			nums[i]=sc.nextInt();
		res=findErrorNums(nums);
		System.out.print(res[0]+" "+res[1]);
	}
}
