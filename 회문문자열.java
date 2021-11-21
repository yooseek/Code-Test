package algolism;

import java.util.*;

public class Main {

	public String Solution(String st) {
		st = st.toLowerCase();
		
		// �ε����� ���ϱ�
		
		int len = st.length()-1;
		for(int i=0; i<st.length()/2 ; i++) {
			if(st.charAt(i) != st.charAt(len)) {
				return "NO";
			}else {
				len -= 1;
			}	
		}
		return "YES";
		/*
		// StringBuilder ����ϱ�
		StringBuilder sb = new StringBuilder(st).reverse();
		if(st.equals(sb.toString())) {
			return "YES";
		}else {
			return "NO";
		}
		*/
	
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.Solution(str));
	}
}