package algolism;

import java.util.*;

public class Main {

	public List<Integer> Solution(String[] num) {
		
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		
		for(String i : num) {
			sb.append(i);
			int a = Integer.parseInt(sb.reverse().toString());
			if(check(a)) {
				list.add(a);
			}
			sb.setLength(0);
		}
		return list;
	}
	public static boolean check(int n) {
		if(n == 1) {
			return false;
		}
		for(int i=2; i<n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];
		for(int i =0;i<N;i++) {
			s[i] = sc.next();
		}
		for(int i : T.Solution(s)) {
			System.out.print(i+" ");
		}
	}
}