import java.util.*;
class P2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int arr[] = new int[n];
for (int i = 0; i < n; i++) 
arr[i] = sc.nextInt();

int temp1 = arr[arr.length - 1];
arr[arr.length - 1] = -1;

for (int i = arr.length - 2; i >= 0; i--) {
int temp2 = arr[i];
arr[i] = temp1;
if (temp1 < temp2) 
temp1 = temp2;

}

for (int i = 0; i < arr.length; i++) 
System.out.print(arr[i] + " ");


System.out.println();

}
}