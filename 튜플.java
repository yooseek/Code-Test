package programus;
import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("[^0-9,]","");
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();

        String[] s2 = s.split(",");

        for(String a : s2) {
            map.put(Integer.parseInt(a),map.getOrDefault(Integer.parseInt(a), 1) + 1);
        }

        int[] i1 = map.values().stream().mapToInt(w->w).sorted().toArray();


        int[] answer = new int[i1.length];
        int length = 0;
        for(int a =i1.length-1;a>=0;a--) {
            for(int b : map.keySet()) {
                if(map.get(b) == i1[a]) {
                    answer[length] = b;
                    length +=1;
                }
            }

        }


        return answer;
    }
}