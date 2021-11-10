package programus;
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int count = 0;
		// 스피드별 작업 일수
		for(int i =0; i<progresses.length;i++) {
			while(progresses[i]<100) {
				progresses[i] += speeds[i];
				count+=1;
			}
			list.add(count);
			count = 0;
		}
		int big =0;
		for(int i =0; i<list.size();i++) {
			if(i==list.size()-1) {
				if(big<list.get(i)) {
					big = list.get(i);
					list2.add(count);
					count = 0;
					count++;
					list2.add(count);
				}else {
					count++;
					list2.add(count);
				}
			}
			if(big<list.get(i)) {
				big = list.get(i);
				list2.add(count);
				count = 0;
				count++;
			}else {
				count++;
			}	
		}
		list2.remove(0);
		
        int[] answer = new int[list2.size()];
        for(int i=0; i<list2.size();i++){
            answer[i] = list2.get(i);
        }
        
        return answer;
    }
}