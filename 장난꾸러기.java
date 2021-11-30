package algolism;

import java.util.*;

public class Main {
	public List<Integer> Solution(int n,int[] arr) {
		
		int[] copy = arr.clone();

		Arrays.sort(copy);
		List<Integer> list = new ArrayList<>();
		for(int i =0;i<copy.length;i++) {
			if(copy[i]!=arr[i]) {
				list.add(i+1);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i : T.Solution(n, arr)) {
			System.out.print(i+" ");
		}
	}
}