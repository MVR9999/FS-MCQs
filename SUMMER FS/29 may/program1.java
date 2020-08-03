import java.util.*;
class  program1
{
	public static int findJudge(int N, int[][] trust) {
		if (trust.length < N - 1) {
			return -1;
		}
		
		int[] indegrees = new int[N + 1];
		int[] outdegrees = new int[N + 1];

		for (int[] relation : trust) {
			outdegrees[relation[0]]++;
			indegrees[relation[1]]++; 
		}

		for (int i = 1; i <= N; i++) {
			if (indegrees[i] == N - 1 && outdegrees[i] == 0) {
				return i;
			}
		  }
		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ntrusts=sc.nextInt();
		int[][] trusts=new int[ntrusts][2];
		for(int i=0;i<ntrusts;i++){
			for (int j=0;j<2 ;j++)	{
				trusts[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<ntrusts;i++)
			for (int j=0;j<2 ;j++)	
				System.out.println(trusts[i][j]);
		
		System.out.println(findJudge(n,trusts));
	}
}


/*
In graph theory, we say the outdegree of a vertex (person) is the number of directed edges going out of it. For this graph, the outdegree of the vertex represents the number of other people that person trusts.

Likewise, we say that the indegree of a vertex (person) is the number of directed edges going into it. So here, it represents the number of people trusted by that person.

We can define the town judge in terms of indegree and outdegree.

The town judge has an outdegree of 0 and an indegree of N - 1 because they trust nobody, and everybody trusts them (except themselves).

Therefore, this problem simplifies to calculating the indegree and outdegree for each person and then checking whether or not any of them meet the criteria of the town judge.

We can calculate the indegrees and outdegrees for everybody, using a single loop over the input trust array. We'll write the results into two arrays.

int[] indegrees = new int[N + 1];
int[] outdegrees = new int[N + 1];

for (int[] relation : trust) {
    outdegrees[relation[0]]++;
    indegrees[relation[1]]++; 
}
Then, we can simply loop over the people (numbered from 1 to N) and check whether or not they meet the town judge criteria.

for (int i = 1; i <= N; i++) {
    if (indegrees[i] == N - 1 && outdegrees[i] == 0) {
        return i;
    }
    return -1;
}
One optimization we can make is to observe that it is impossible for there to be a town judge if there are not at least N - 1 edges in the trust array. This is because a town judge must have N - 1 in-going edges, and so if there aren't at least N - 1 edges in total, then it is impossible to meet this requirement. This observation will also be very useful when we're reasoning about the time complexity.

If trust.length < N - 1, then we can immediately return -1
*/