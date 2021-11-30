package algolism;

import java.util.*;

public class Main {
	public void Solution(int n,int[] arr) {
		
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new Point(sc.nextInt(),sc.nextInt()));
		}
		
		Collections.sort(list);
		
		for(Point p : list) {
			System.out.print(p.x+" "+p.y);
			System.out.println();
		}

	}
}
class Point implements Comparable<Point>{
	public int x;
	public int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		if(this.x==o.x) {
			return this.y - o.y;
		}else {
			return this.x - o.x;
		}
	}
}