package algolism;
import java.util.*;

public class Main {

	public String[] Solution(int count, String[] s) {
		
		StringBuilder sb = new StringBuilder();
		String[] copy = new String[s.length];
		for(int j =0; j<s.length;j++) {
			String ss = s[j];
			for(int i= ss.length()-1; i>=0 ; i--) {
				sb.append(ss.charAt(i));
			}
			copy[j] = sb.toString();
			sb.setLength(0);
		}
		
		return copy;
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] s = new String[count];
		for(int i=0;i<count;i++) {
			s[i] = sc.next();
		}
		for(String ss: T.Solution(count,s)) {
			System.out.println(ss);
		}
	}
}