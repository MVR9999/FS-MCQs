import java.util.*;
class MetaStrings
{ 
	static boolean areMetaStrings(String str1, String str2) 
	{ 
    if(str1.length()!=str2.length())
      return false;
    else{
      char[] arr1=str1.toCharArray();
      char[] arr2=str2.toCharArray();
      int count=0;
      for(int i=0;i<str1.length();i++){
        if(arr1[i]!=arr2[i])
          count++;
      }
      if(count==2)
         return true;
      else 
        return false;
     }
  }		
	
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		String str1 ,str2;
		str1=sc.next();
		str2=sc.next();
	  System.out.println(areMetaStrings(str1,str2) ? "Yes" :"No"); 
	} 
} 
