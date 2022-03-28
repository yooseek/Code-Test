package algolism;

import java.io.*;
import java.util.*;

public class Main {
	static Map<String,String> map =new HashMap<>();
	static Map<String,Integer> answer =new HashMap<>();
	
	public static void main(String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
		String[] seller = {"young", "john", "tod", "emily", "mary"};
		int[] amount = {12, 4, 2, 5, 10};
		
		int[] ans = new int[enroll.length];
		for(int i=0; i<enroll.length;i++) {
			map.put(enroll[i],referral[i]);
			answer.put(enroll[i],0);
		}
		for(int i=0; i<amount.length ;i++) {
			find(seller[i],amount[i]*100);
		}
		for(int i=0; i<enroll.length;i++) {
			ans[i] = answer.get(enroll[i]);
		}
		
	}
	public static int find (String name, int money) {
		if(money == 0) return 0;
		if(name.equals("-")) return money;
		answer.put(name, answer.get(name)+ (money - find(map.get(name), money/10)));
		return money;
	}
}
class Node {
	String name;
	String recommand;
	public Node(String n, String r){
		this.name = n;
		this.recommand = r;
	}
}