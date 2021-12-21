package algolism;

import java.util.*;
import java.io.*;

public class Main {
	static int[] coin;
	static int n;
	static int[] change;
	static int answer;
	public void Solution(int index) {
		
	}
	public static void main(String[] args) throws IOException {
		Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		coin = new int[n];
		for (int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(st.nextToken());
		}
		int ch = Integer.parseInt(br.readLine());
		change = new int[ch+1];
		Arrays.fill(change,Integer.MAX_VALUE);
		change[0] = 0;
		for(int i=0;i<n;i++) {
			 for(int j=coin[i];j<ch+1;j++) {
				 change[j]=Math.min(change[j-coin[i]]+1,change[j]); 
			 }
		}

		System.out.println(change[ch]);
	}
}
