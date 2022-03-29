package algolism;

import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		String number = "4177252841";
		int k = 4;
		// 출력 자리값
		int limit = number.length() - 4;
		StringBuilder answer = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		// 스택을 사용해서 작은 숫자 제거하기
		for(int i=0; i< number.length(); i++) {
			while(!stack.isEmpty() && stack.peek()-'0' < number.charAt(i)-'0' && k > 0) {
				stack.pop();
				k--;
			}
			stack.push(number.charAt(i));
		}
		
		for(int i =0; i<limit;i++) {
			answer.append(stack.get(i));
		}
		System.out.println(answer.toString());
		
		
	}
}