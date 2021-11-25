package algolism;

import java.util.*;

public class Main {
	static boolean[] check;
	static TreeSet<Integer> set;
	public int Solution(int n, int r, int[] num) {
		
		check = new boolean[n];
		// 트리셋 내림차순
		set = new TreeSet<>(Collections.reverseOrder());
		
		dfs(0,n,3,num);
		if(set.size() < r) {
			return -1;
		}
		int answer=0;
		for(int i=0;i<r;i++) {
			answer = set.pollFirst();
		}
		
		return answer;
		
	}
	// 조합
	public static void dfs(int index, int n, int r,int[] num) {
		if(r == 0) {
			int sum =0;
			for(int i=0;i<check.length;i++) {
				if(check[i]) {
					sum += num[i];
				}
			}
			set.add(sum);
			return;
		}
		if(index == n) {
			return;
		}
		check[index] = true;
		dfs(index +1,n,r-1,num);
		check[index] = false;
		dfs(index +1,n,r,num);
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println(T.Solution(n,r,num));
	}
}