package algolism;

import java.util.*;

public class test3 {
	static List<String> cos;
	static List<String> answer;
	static String[][] tickets;
	static int n;
	static boolean[] check;
	public static void main(String[] args) {
		cos = new ArrayList<>();
		answer = new ArrayList<>();
		String[][] tik ={{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
		tickets = new String[tik.length][2];
		tickets = tik;
		check = new boolean[tickets.length];
		n= tickets.length;
		
		for(int i=0;i<tickets.length;i++) {
			if(tickets[i][0]=="ICN") {
				check[i] = true;
				cos.add(tickets[i][0]);
				cos.add(tickets[i][1]);
				dfs(1,tickets[i][1]);
				cos.clear();
				check[i] = false;
			}
		}
		Collections.sort(answer);
		int start = 0;
		int end = 3;
		String[] as = new String[answer.get(0).length()/3];
        
		for(int i=0; i<answer.get(0).length()/3;i++) {
			as[i] = answer.get(0).substring(start,end);
			start +=3;
			end +=3;
		}
		for(String s: as) {
			System.out.println(s);
		}
	}
	public static void dfs(int depth, String begin) {
		if(depth == n) {
			StringBuilder sb = new StringBuilder();
			for(String s :cos) {
				sb.append(s);
			}
			answer.add(sb.toString());
			return;
		}else {	
			for(int i=0;i<tickets.length;i++) {
				if(tickets[i][0] == begin && check[i]==false) {
					cos.add(tickets[i][1]);
					check[i] = true;
					dfs(depth+1,tickets[i][1]);
					check[i] = false;
				}
			}
		}
	}
}