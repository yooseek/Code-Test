import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int N, int number) {
        int answer = DP(N,number);
        return answer;
    }
    static int DP(int n, int number) {
        if(n == number) return 1;

        ArrayList<Set<Integer>> list = new ArrayList<>();
        list.add(null);
        list.add(new HashSet<Integer>());
        list.get(1).add(n);

        for(int i = 2; i <= 8; i++) {
            list.add(new HashSet<Integer>());
            int temp = 0;
            for(int tmp = i-1; tmp >=0 ; tmp--) {
                temp += n*Math.pow(10,tmp);
            }
            list.get(i).add(temp);
            for(int j = 1; j < i ; j++) {
                for(int k : list.get(j)) {
                    for(int l : list.get(i-j)) {
                        list.get(i).add(k+l);
                        list.get(i).add(k-l);
                        list.get(i).add(k*l);
                        if(l != 0) list.get(i).add(k/l);
                    }
                }
            }
            for(int an : list.get(i)) {
                if(an == number) return i;
            }
        }

        return -1;
    }
}
