package algolism;
import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);

        for(int i=0; i<arr.length;i++){
            if(stack.peek()!=arr[i]) {
                stack.add(arr[i]);
            }
        }
        int[] answer = stack.stream().mapToInt(s->s).toArray();

        return answer;
    }
}