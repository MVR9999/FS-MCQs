
import java.util.*;
class program3
{
	private static Map<Character, Character> transition = new HashMap(){{
            put('0','0');
            put('8','8');
            put('1','1');
            put('2','5');
            put('5','2');
            put('6','9');
            put('9','6'); }};
    public static int rotatedDigits(int N) {
        if(N==0)
            return 0;
        int count = 0;  
        for(int i=1; i<=N; i++){
            String oldNo = Integer.toString(i);
            boolean isValid = true;
            StringBuilder newNo = new StringBuilder();
            for(char ch : oldNo.toCharArray()){
                if(!transition.containsKey(ch)){
                    isValid = false;
                    break;
                } else {
                    newNo.append(transition.get(ch));
                }
            }
            if(isValid && !newNo.toString().equals(oldNo)){
                count++;
            }
            
        }
        return count;
        
    } 

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(rotatedDigits(n));
	}
}
