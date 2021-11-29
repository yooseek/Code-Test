package algolism;

import java.util.*;

public class Main {
	public int[] Solution(int n,int[] arr) {
		
		for(int i =0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
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