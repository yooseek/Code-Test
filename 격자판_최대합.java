package algolism;

import java.util.*;

public class Main {

	public int Solution(int[][] map) {
		
		int count = 0; // 행의 합 , 오른쪽 대각선의 합
		int count2 = 0; // 열의 합, 왼쪽 대각선의 합
		int a = 0;
		int len = map.length-1;
		
		List<Integer> list = new ArrayList<>();
		for(int j=0; j<map.length;j++) {
			for(int i=0;i<map.length;i++) {
				count += map[i][j];
				count2 += map[j][i];		
			}
			list.add(count);
			list.add(count2);
			count = 0;
			count2 =0;
		}
		while(a<map.length) {
			count += map[a][len];
			count2 += map[a][a];
			a += 1;
			len -= 1;
		}
		
		list.add(count);
		list.add(count2);
		int answer = Collections.max(list);
		
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] m = new int[N][N];
		
		for(int i =0;i<N;i++) {
			for(int j=0; j<N;j++) {
				m[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.Solution(m));
		
	}
}