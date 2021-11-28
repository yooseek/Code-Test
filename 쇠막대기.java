package algolism;

import java.util.*;

public class Main {
	public int Solution(String str) {
		
		Stack<Character> stack = new Stack<>();
		int count =0;
		int answer =0;
		for(char c : str.toCharArray()) {
			if(c=='(') {
				count +=1;
				stack.add(c);
			}else {
				count -=1;
				if(stack.peek()=='(') {
					answer += count;
				}else {
					answer += 1;
				}
				stack.add(c);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		System.out.println(T.Solution(n));
	}
}