package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static int[][] map;
	static boolean[][] check;
	static int[] nx = {-1,0,1,0};
	static int[] ny = {0,-1,0,1};
	static int count;
	public void Solution(int x,int y) {
		if(x==6 && y ==6) {
			count +=1;
		}else {
			for(int i =0; i<4;i++) {
				int newX = nx[i] + x;
				int newY = ny[i] + y;
				if(newX>=0 && newX<7 && newY >=0 && newY<7 && map[newX][newY] ==0) {
					if(!check[newX][newY]) {
						check[newX][newY]=true;
						Solution(newX, newY);
						check[newX][newY] = false;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());	
		Scanner sn= new Scanner(System.in);
		map = new int[7][7];
		check = new boolean[7][7];
		for(int i =0;i<7;i++) {
			for(int j=0;j<7;j++) {
				map[i][j] = sn.nextInt();
			}
		}
		count =0;
		check[0][0] = true;
		T.Solution(0,0);
		System.out.println(count);
	}
}
