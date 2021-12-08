package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static int[][] map;
	static int[][] check;
	static int[] nx = {-1,0,1,0};
	static int[] ny = {0,-1,0,1};
	static int count;
	public int Solution(int x,int y) {
		
		Queue<int[]> que = new LinkedList<>();
		
		que.add(new int[] {0,0});
		
		while(!que.isEmpty()) {
			
			int[] xy = que.poll();
			int x1 = xy[0];
			int y1 = xy[1];
			if(x1==6 && y1==6) {
				return check[x1][y1];
			}
			for(int i=0; i<4;i++) {
				int newX = nx[i] +x1;
				int newY = ny[i] +y1;
				if(newX>=0 && newX<7 && newY>=0 && newY<7 && map[newX][newY]==0) {
					map[newX][newY] = 1;
					check[newX][newY] = check[x1][y1] +1;
					que.add(new int[] {newX,newY});
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());	
		Scanner sn= new Scanner(System.in);
		map = new int[7][7];
		check = new int[7][7];
		for(int i =0;i<7;i++) {
			for(int j=0;j<7;j++) {
				map[i][j] = sn.nextInt();
			}
		}
		count =0;
		check[0][0] = 0;
		System.out.println(T.Solution(0,0));
	}
}
