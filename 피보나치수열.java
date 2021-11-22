package algolism;

import java.util.*;

public class Main {

	public List<Integer> Solution(int N) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		
		for(int i=2; i<N; i++) {
			list.add(list.get(i-1)+list.get(i-2));
		}
		return list;
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i : T.Solution(N)) {
			System.out.print(i+" ");
		}
		
	}
}