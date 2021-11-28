package algolism;

import java.util.*;

public class Main {
	public List<Character> Solution(String str) {
		
		Stack<Character> stack = new Stack<>();
		List<Character> list = new ArrayList<>();
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='(') {
				stack.add(str.charAt(i));
			}else if(str.charAt(i)==')'){
				stack.pop();
			}
			if(str.charAt(i)!=')' && stack.isEmpty()) {
				list.add(str.charAt(i));
			}
		}
		
		return list;
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		for(char c : T.Solution(n)) {
			System.out.print(c);
		}
	}
}