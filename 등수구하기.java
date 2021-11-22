package algolism;

import java.util.*;

public class Main {

	public List<Integer> Solution(int[] num) {
		
		List<Integer> list = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();
		for(int i : num) {
			list.add(i);
		}
		Collections.sort(list,Collections.reverseOrder());
		for(int i : num) {
			answer.add(list.indexOf(i) + 1);
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] s = new int[N];
		for(int i =0;i<N;i++) {
			s[i] = sc.nextInt();
		}
		for(int i : T.Solution(s)) {
			System.out.print(i+" ");
		}
		
	}
}