package algolism;

import java.util.*;

public class Main {

	public String Solution(String st) {
		
		char[] c = st.toCharArray();
		int lt = 0;
		int rt = c.length -1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(c[lt])) {
				lt += 1;
			}if(!Character.isAlphabetic(c[rt])) {
				rt -= 1;
			}
			if(Character.isAlphabetic(c[rt])&Character.isAlphabetic(c[lt])) {
				char cc = c[lt];
				c[lt] = c[rt];
				c[rt] = cc;
				lt += 1;
				rt -= 1;
			}
		}
		String asnwer = String.valueOf(c);
		return asnwer;
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.Solution(str));
	}
}
