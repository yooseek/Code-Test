package algolism;

import java.util.*;

public class Main {
	public int Solution(int num) {
		// 투 포인터로 풀기
		int p2 = 1;
		int sum = 0;
		int count =0;
		for(int p1 = 1; p1<=num/2+1;p1++) {
			sum += p1;
			if(sum == num) count++;
			while(sum>=num) {
				sum -= p2++;
				if(sum == num) count++;
			}
		}
		//return count;
		// 수학적 방법으로 풀기
		int answer =0;
		int cnt = 1;
		num --;
		while(num > 0) {
			cnt ++;
			num = num - cnt;
			if(num%cnt == 0) answer ++;
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(T.Solution(N));
	}
}