import java.util.*;
class ExcelColumn{ 
	private static void printString(int columnNumber) 
	{ 

		StringBuilder columnName = new StringBuilder(); 

		while (columnNumber > 0) { 

			int rem = columnNumber % 26; 

			if (rem == 0) { 
				columnName.append("Z"); 
				columnNumber = (columnNumber / 26) - 1; 
			} 
			else
			{ 
				columnName.append((char)((rem - 1) + 'A')); 
				columnNumber = columnNumber / 26; 
			} 
		} 
	System.out.println(columnName.reverse()); 
	} 


	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printString(n); 
	} 
} 


