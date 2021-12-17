package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static long[] dy;
	static int n;
	public Long Solution(int n) {
	
		dy[1] = 1;
		dy[2] = 1;
		dy[3] = 1;
		for(int i=4;i<=n;i++) {
			dy[i] = dy[i-2] +dy[i-3];
		}
		return dy[n];
	}
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		Scanner sn= new Scanner(System.in);
		n = sn.nextInt();
		dy = new long[101];
		while(sn.hasNext()) {
			System.out.println(T.Solution(sn.nextInt()));
		}
		//StringTokenizer st = new StringTokenizer(br.readLine());	
	}
}
