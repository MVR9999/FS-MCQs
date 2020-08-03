import java.util.*;
class program1{ 
public static void check_string_exist(String S) 
	{ 
		int size = S.length(); 
		boolean check = true; 
		
		for(int i = 0; i < size; i++) 
		{ 
			
		// Check if any character at position i and i+2 are not equal then string doesnot exist 
		if (S.charAt(i) != S.charAt((i + 2) % size)) 
		{ 
			check = false; 
			break; 
		} 
		} 
		
		if (check) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 

public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	String S=sc.next();
	check_string_exist(S); 
} 
} 

