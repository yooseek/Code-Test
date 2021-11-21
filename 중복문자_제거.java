package algolism;

import java.util.*;

public class Main {

	public String Solution(String st) {
		// set을 이용한 풀이
		Set<Character> set = new TreeSet<>();
		char[] cr = st.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char c : cr) {
			if(set.add(c)) {
				sb.append(c);
			}
		}
		// index를 이용한 풀이
		StringBuilder sb2 = new StringBuilder();
		
		for(int i =0; i<st.length();i++) {
			if(st.indexOf(st.charAt(i))==i) {
				sb2.append(st.charAt(i));
			}
		}
		return sb2.toString();
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.Solution(str));
	}
}