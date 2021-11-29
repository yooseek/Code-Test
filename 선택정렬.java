package algolism;

import java.util.*;

public class Main {
	public int[] Solution(int n,int[] arr) {
		
		int count = 0;
		for(int i =0;i<n-1;i++) {
			int idx = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[idx]) {
					idx = j;
				}
			}
			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i : T.Solution(n, arr)) {
			System.out.print(i + " ");
		}
		
	}
}