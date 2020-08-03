import java.util.Scanner;

class Program3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int total = 0;
		int total1 = 0;
		int total2 = 0;
		
		int min = 1000;

		if (n > 0) {
			int[] choc = new int[n];

			for (int j = 0; j < n; j++) {
				choc[j] = in.nextInt();
				min = Math.min(min, choc[j]);
			}
			for (int j : choc) {
				total += (j - min) / 5 + ((j - min) % 5) / 2
						+ ((j - min) % 5) % 2;
				total1 += (j + 1 - min) / 5 + ((j + 1 - min) % 5) / 2
						+ ((j + 1 - min) % 5) % 2;
				total2 += (j + 2 - min) / 5 + ((j + 2 - min) % 5) / 2
						+ ((j + 2 - min) % 5) % 2;
			}
		}
		System.out.println(Math.min(Math.min(total, total1), total2));
	}
}