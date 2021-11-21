package algolism;

import java.util.*;

public class Main {

	public String Solution(String st) {
		
		st = st.replaceAll("[^0-9]","");
		
		int answer = Integer.parseInt(st);
		
		return String.valueOf(answer);
	
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(T.Solution(str));
	}
}