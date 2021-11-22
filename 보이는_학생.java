package algolism;

import java.util.*;

public class Main {

	public int Solution(int N,int[] st) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(st[0]);
		int look = st[0];
		for(int i=1; i<st.length;i++) {
			if(look < st[i]) {
				list.add(st[i]);
				look = st[i];
			}
		}
		return list.size();
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int[] num = new int[i];
		for(int j=0;j<num.length;j++) {
			num[j] = sc.nextInt();
		}
		System.out.println(T.Solution(i, num));
	}
}