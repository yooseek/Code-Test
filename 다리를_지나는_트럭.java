package algolism;

import java.util.*;

public class test4 {
	public static void main(String[] args) {
		
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10};
		
		Queue<Integer> que = new LinkedList<>();
		Queue<Integer> ready = new LinkedList<>();
		
		for(int i=0; i<bridge_length;i++) {
			que.offer(0);
		}
		for(int i=0; i<truck_weights.length;i++) {
			ready.offer(truck_weights[i]);
		}
		
		int time =0;
		int totalweight = 0;
		while(!que.isEmpty()) {
			
			totalweight -= que.poll();
			if(ready.isEmpty()) {
				 time += bridge_length-1;
				 break;
			}
			
			if(totalweight + ready.peek() <=weight) {
				totalweight += ready.peek();
				que.offer(ready.poll());
			}else {
				que.offer(0);
			}
			
			time +=1;
		}
		System.out.println(time);
	}
}