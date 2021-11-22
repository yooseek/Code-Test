package algolism;

import java.util.*;

public class Main {

	public int Solution(int N) {
		
		int count = 0;
		int[] ch = new int[N+1];
		for(int i =2; i<=N ; i++) {
			if(ch[i]==0) {
				count+=1;
				for(int j=i;j<=N;j+=i) {
					ch[j] =1;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(T.Solution(N));
		
	}
}