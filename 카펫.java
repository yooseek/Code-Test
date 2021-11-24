package algolism;
import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        List<int[]> list = check(yellow);
        List<Integer> answer = new ArrayList<>();
        
		for (int[] i : list) {
			if ((i[0] + 2) * (i[1] + 2) - yellow == brown) {
				return new int[] {i[0]+2,i[1]+2};
			}
		}
        int[] answer2 ={};
        return answer2;

    }
    public static List<int[]> check(int num) {
		List<int[]> list = new ArrayList<>();
		for(int i=num;i>=1;i--) {
			if(num%i==0) {
				list.add(new int[] {i,num/i});
			}
		}
		return list;
	}
}