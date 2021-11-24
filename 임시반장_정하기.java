package algolism;
import java.util.*;

public class Main {
	public int Solution(int num , int[][] map) {
		
		int answer = 0 ;
		int max = 0;
		
		for(int i=1; i<=num; i++) {
			int count =0;
			for(int j=1; j<=num;j++) {
				for(int k =1; k<6 ;k++) {
					if(map[i][k] ==map[j][k]) {
						count +=1;
						break;
					}
				}
			}
			if(count > max) {
				max = count;
				answer = i;
			}
			
		}		
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] m = new int[N+1][6];
		
		for(int i =1;i<N+1;i++) {
			for(int j=1; j<=5;j++) {
				m[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.Solution(N,m));
	}
}