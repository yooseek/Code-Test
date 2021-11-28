package algolism;

import java.util.*;

public class Main {
	public int Solution(int n,int m) {
		
		Queue<Integer> queue = new LinkedList();
		int count =0;
		for(int i=1;i<=n;i++) {
			queue.add(i);
		}
		while(queue.size()!=1){
			int poll = queue.poll();
			count +=1;
			if(count == m) {
				count=0;
			}else {
				queue.add(poll);
			}
		}
		return queue.peek();
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(T.Solution(n,m));
	}
}