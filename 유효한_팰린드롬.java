package algolism;

import java.util.*;

public class Main {

	public String Solution(String st) {
		st = st.toLowerCase();
		st = st.replaceAll("[^a-z]","");
		int len = st.length() -1;
		for(int i =0; i<st.length()/2 ; i ++) {
			if(st.charAt(i) != st.charAt(len)) {
				return "NO";
			}
			len -= 1;
		}
		
		return "YES";
	
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(T.Solution(str));
	}
}