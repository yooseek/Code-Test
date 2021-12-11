package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static int n;
	static int[][] map;
	static int[] nx = {-1,-1,0,1,1,1,0,-1};
	static int[] ny = {0,1,1,1,0,-1,-1,-1};
	static int count = 0;
	public void Solution(int x,int y) {
		
		if(map[x][y]==0) {
			return;
		}else {
			map[x][y] = 0;
			for(int i=0;i<8;i++) {
				int newX = x + nx[i];
				int newY = y + ny[i];
				if(newX >=0 && newX <n && newY>=0 && newY<n && map[newX][newY]==1) {
					Solution(newX,newY);
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());	
		Scanner sn= new Scanner(System.in);
		n = sn.nextInt();
		map = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				map[i][j]=sn.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j] != 0) {
					T.Solution(i, j);
					count +=1;
				}
			}
		}
		System.out.println(count);
	}
}
