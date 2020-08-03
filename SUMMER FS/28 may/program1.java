import java.util.*;
class program1 {

	public static int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   
			return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) 
            map.put(i, map.getOrDefault(i, 0) + 1);
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                } 
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        
        return count;
    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n ;i++ )
			arr[i]=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(findPairs(arr,k));
	}
}
