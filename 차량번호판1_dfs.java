package algolism;

import java.io.*;

public class Main {
	static int count;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		String s = br.readLine();
		combi(0,s,' ');
		
		System.out.println(count);
	}
	static void combi(int level, String s,char last) {
		if(level == s.length()) {
			count ++;
			return;
		}
		char start = s.charAt(level) == 'd' ? 0 : 'a';
		char end = s.charAt(level) == 'd' ? 9 : 'z';
		for(char i = start; i<=end;i++) {
			if(last != i) {
				combi(level+1,s,i);
			}
		}
	}
}