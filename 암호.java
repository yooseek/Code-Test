package algolism;

import java.util.*;

public class Main {

	public String Solution(String st) {
		
		List<String> list = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();
		// 일곱개씩 자르고 이진수로 변환
		int seven = 7;
		while(!st.isEmpty()) {
			String str = st.substring(0,seven).replace("#","1").replace("*","0");
			list.add(str);
			st = st.substring(seven);
		}
		//각 아스키코드로 변환 후 문자 변환
		StringBuilder sb = new StringBuilder();
		for(String s: list) {
			sb.append((char)Integer.parseInt(s,2));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String str = sc.next();
		
		System.out.println(T.Solution(str));
	}
}