package algolism;

import java.util.*;

public class Main {

	public int Solution(int[] num) {
		
		int total = 0;
		int count = 0;
		for(int i=0; i<num.length;i++) {
			if(num[i]==0) count = 0;
			if(num[i]==1) {
				count += 1;
				total += count;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] s = new int[N];
		for(int i =0;i<N;i++) {
			s[i] = sc.nextInt();
		}
		System.out.println(T.Solution(s));
	}
}