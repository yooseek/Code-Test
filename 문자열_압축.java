package algolism;

import java.util.*;

public class Main {

	public String Solution(String st) {
		st = st+" ";
		char[] c = st.toCharArray();
		int count =0;
		StringBuilder sb = new StringBuilder();
		sb.append(c[0]);
		for(int i = 1; i<c.length ;i++) {
			if(c[i] == c[i-1]) {
				count += 1;
			}else {
				count += 1;
				if(count != 1) {
					sb.append(String.valueOf(count));
				}
				count = 0;
				sb.append(c[i]);
			}
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.Solution(str));
		
	}
}