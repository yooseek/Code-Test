package algolism;
import java.util.*;

public class Main {
	public List<Integer> Solution(int[] a,int[] b) {
		
		int p1 =0;
		int p2 =0;
		
		List<Integer> list = new ArrayList<>();
		while(p1<a.length && p2<b.length) {
			if(a[p1] < b[p2]) {
				list.add(a[p1]);
				p1 += 1;
			}else {
				list.add(b[p2]);
				p2 += 1;
			}
		}
		while(p1 < a.length) {
			list.add(a[p1++]);
		}
		while(p2 < b.length) {
			list.add(b[p2++]);
		}
		return list;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] first = new int[N];
		for(int i=0;i<N;i++) {
			first[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[] second = new int[M];
		for(int i=0;i<M;i++) {
			second[i] = sc.nextInt();
		}
		for(int i : T.Solution(first, second)) {
			System.out.print(i + " ");
		}
	}
}