package algolism;

import java.util.*;

public class Main {
	public int Solution(String str) {
		
		Stack<Integer> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) {
				stack.add(Character.getNumericValue(c));
			}else {
				int second = stack.pop();
				int first = stack.pop();
				int answer = 0;
				if(c=='+') answer = first+second;
				if(c=='-') answer = first-second;
				if(c=='*') answer = first*second;
				if(c=='/') answer = first/second;
				stack.add(answer);
			}
		}
		return stack.get(0);
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		System.out.println(T.Solution(n));
	}
}