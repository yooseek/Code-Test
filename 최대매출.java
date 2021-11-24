package algolism;

import java.util.*;

public class Main {
	public int Solution(int num , int[] total) {
		
		int p1 = 0;
		int p2 = p1 + num;
		int sum = 0;
		// N 개의 초기값 설정
		for(int i = p1; i<p2 ; i++) {
			sum += total[i];
		}
		int max = sum;
		// total 끝까지 계산
		while(p2 < total.length) {	
			sum = sum + total[p2] - total[p1];
			if(sum > max) {
				max = sum;
			}
			p1 ++;
			p2 ++;
		}
		return max;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] total = new int[N];
		for(int i =0; i<N;i++) {
			total[i] = sc.nextInt();
		}
		System.out.println(T.Solution(M,total));
	}
}