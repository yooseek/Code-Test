package algolism;

import java.util.*;

public class test3 {
	static int answer;
    static int min;
	static String target;
	static String[] words;
    static boolean[] ck;
    public int solution(String begin, String tg, String[] word) {
        
        target = tg;
        words = word;
        ck = new boolean[words.length];
		min = Integer.MAX_VALUE;
		dfs(0,begin);
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
	public static void dfs(int depth, String begin) {
		
		if(begin.equals(target)) {
			min = Math.min(min,answer);
		}else {
			for(int i=0;i<words.length;i++) {
				if(check(begin,words[i]) && ck[i]==false) {
					answer +=1;
					ck[i] = true;
					dfs(depth,words[i]);
					ck[i] = false;
					answer -= 1;
				}
			}
		}
	}
	public static boolean check(String begin,String check) {
		int count =0;
		for(int i=0;i<begin.length();i++) {
			if(begin.charAt(i)!=check.charAt(i)) {
				count += 1;
			}
		}
		if(count == 1) {
			return true;
		}else {
			return false;
		}
	}
}