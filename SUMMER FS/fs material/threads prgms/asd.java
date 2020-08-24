/*Input
6
coding is joy
c is a programming language
coding gives pleasure
c made revoultion
creativity and innovation
yesterday was holiday

Expected output

coding is joy
coding gives pleasure
c made revoultion
yesterday was holiday
---------------
Input
5
apple is red
apple is fruit
elephant is animal
zebra is animal
apple is sweet
Expected output
apple is red
zebra is animal
apple is sweet
-----------------------
Input
4
this is march
next month is april
corona lockdown
world suffering from corona
Expected output
next month is april
corona lockdown
world suffering from corona

*/











import java.util.*;
class asd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> res[]=new ArrayList[n];
        int c=0;
		sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String s=sc.nextLine();
            String s1[]=s.split(" ");
            StringBuilder sb1=new StringBuilder();
            StringBuilder sb2=new StringBuilder();
            Arrays.sort(s1);
            for(int j=0;j<s1.length;j++)
            {
                if(j!=s1.length-1)
                {
                    sb1.append(s1[j]);
                    sb1.append(" ");
                }
                else
                sb1.append(s1[j]);
            }
            for(int j=s1.length-1;j>=0;j--)
            {
                if(j!=0)
                {
                    sb2.append(s1[j]);
                    sb2.append(" ");
                }
                else
                sb2.append(s1[j]);
            }
            if((sb1.toString()).equals(s) || (sb2.toString()).equals(s))
            {
                res[c]=new ArrayList<>();
                res[c].add(s);
                c++;
            }
            
            
        }
		System.out.println("-----------------------------------");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<res[i].size();j++)
        System.out.println(res[i].get(j));
        }
    }
}