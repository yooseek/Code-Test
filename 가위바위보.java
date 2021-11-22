package algolism;

import java.util.*;

public class Main {

	public List<String> Solution(int[] A,int[] B) {
		
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<A.length;i++) {
			if(A[i]==B[i]) {
				list.add("D");
			}else if(A[i]==1 && B[i]==3) list.add("A");
			else if(A[i]==2 && B[i]==1) list.add("A");
			else if(A[i]==3 && B[i]==2) list.add("A");
			else {
				list.add("B");
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int j=0;j<A.length;j++) {
			A[j] = sc.nextInt();
		}
		for(int j=0;j<B.length;j++) {
			B[j] = sc.nextInt();
		}
		for(String s: T.Solution(A, B)) {
			System.out.println(s);
		}
	}
}