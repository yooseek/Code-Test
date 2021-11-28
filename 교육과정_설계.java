package algolism;

import java.util.*;

public class Main {
	public String Solution(String n,String m) {
		
		Queue<Character> queue = new LinkedList();
		int index = 0;
		for(char c : n.toCharArray()) {
			queue.add(c);
		}
		for(int i=0; i<m.length();i++) {
			if(m.charAt(i)==queue.peek()) {
				queue.poll();
			}
			if(queue.isEmpty()) {
				return "YES";
			}
		}
		
		return "NO";
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String m = sc.next();
		
		System.out.println(T.Solution(n,m));
	}
}