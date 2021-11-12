package programus;
import java.util.*;
public class 가장_큰_그림찾기 {
	
	static boolean[][] check;
	static int count;
	static List<Integer> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] paint = {{1,0,0,1,1},
				{1,1,1,0,0},
				{1,0,0,0,1},
				{0,0,0,1,1}};
		
		check = new boolean[paint.length][paint[0].length];
		count =0;
		list = new ArrayList<Integer>();
		for(int i=0; i<paint.length;i++) {
			for(int j=0; j<paint[i].length;j++) {
				dfs(paint,check,i,j);
			}
		}
		System.out.println("가장 큰 그림 : "+Collections.max(list));
		System.out.println("전체 그림의 갯수 : "+list.size());
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		
		
	}
	public static void dfs(int[][] paint, boolean[][] check,int i,int j) {
		
		if(paint[i][j]== 1  && check[i][j]== false) {
			check[i][j] = true;
			count += 1;
			if(i+1<paint.length && paint[i+1][j]==1 && check[i+1][j] == false) {
				dfs(paint,check,i+1,j);
			}
			if(j+1<paint.length && paint[i][j+1]==1 && check[i][j+1] == false) {
				dfs(paint,check,i,j+1);
			}
			if(i-1>=0 && paint[i-1][j]==1 && check[i-1][j] == false) {
				dfs(paint,check,i-1,j);
			}
			if(j-1>=0 && paint[i][j-1]==1 && check[i][j-1] == false) {
				dfs(paint,check,i,j-1);
			}	
		}else {
			if(count != 0) {
				list.add(count);
			}
			count = 0;
			return;
		}
		
	}
	
}
