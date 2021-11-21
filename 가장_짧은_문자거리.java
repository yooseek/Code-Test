package algolism;

import java.util.*;

public class Main {

	public int[] Solution(String st,char st2) {
		
		char[] c = st.toCharArray();
		int[] answer = new int[st.length()];
		
		int p = 1000;
		for(int i=0; i<c.length;i++) {
			if(c[i] == st2) {
				p=0;
				answer[i] = p;		
			}else {
				p += 1;
				answer[i] = p;
			}
		}
		p = 1000;
		for(int i=c.length-1; i>=0;i--) {
			if(c[i] == st2) {
				p=0;
				if(answer[i] > p)
				answer[i] = p;		
			}else {
				p += 1;
				if(answer[i] > p)
				answer[i] = p;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char str2 = sc.next().charAt(0);
		
		for(int i : T.Solution(str, str2)) {
			System.out.print(i+" ");
		}
	}
}