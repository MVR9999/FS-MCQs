import java.util.*;

class program1 {
    
	public static String toHexspeak(String num) {
        long n = Long.parseLong(num);
        HashMap<Integer, Character> map = new HashMap<>();
		map.put(0, 'O');
		map.put(1, 'I');
        map.put(10, 'A');
        map.put(11, 'B');
        map.put(12, 'C');
        map.put(13, 'D');
        map.put(14, 'E');
        map.put(15, 'F');
        
        String ans = "";
        
        while(n > 0){
            int rem = (int)(n % 16);
            if(rem > 1 && rem < 10) return "ERROR";
            n = n / 16;
			ans = map.get(rem) + ans;
        }
        
        return ans;
        
    }
	public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
	   String n=sc.next();
	   System.out.println(toHexspeak(n));
	}
}