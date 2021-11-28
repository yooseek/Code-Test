package algolism;

import java.util.*;

public class Main {
	public String Solution(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='(') {
				stack.add(str.charAt(i));
			}else {
				if(stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) {
			return "NO";
		}
		return "YES";
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		
		System.out.println(T.Solution(n));
	}
}