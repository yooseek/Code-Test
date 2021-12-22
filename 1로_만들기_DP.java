package algolism;

import java.util.*;
import java.io.*;

public class Main {
	static long n;
	static long[] arr;
	public long Solution() {
		
		if(n==1) return 0;
		if(n==2) return 1;
		if(n==3) return 1;
		
		arr[1] = 0;
		arr[2] = 1;
		arr[3] = 1;
		for(int i=4;i<=n;i++) {
			if(i%6 == 0) {
				arr[i] = Math.min(arr[i/2],arr[i/3]) + 1;
			}else if(i%2 == 0) {
				arr[i] = Math.min(arr[i/2],arr[i-1]) + 1;
			}else if(i%3 == 0) {
				arr[i] = Math.min(arr[i/3],arr[i-1]) + 1;
			}else {
				arr[i] = arr[i-1] + 1;
			}
		}
		
		return arr[(int) n];
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//n = Integer.parseInt(br.readLine());
		//StringTokenizer st = new StringTokenizer(br.readLine());
		n = Long.parseLong(br.readLine());
		arr = new long[(int) (n+1)];
		
		
		System.out.println(T.Solution());
	}
}
