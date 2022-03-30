package algolism;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int ban_count;
	static int hura;
	static int yang;
	static int yang_limit;
	static int hura_limit;
	static int answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		yang = Integer.parseInt(st.nextToken());
		hura = Integer.parseInt(st.nextToken());
		int ban = Integer.parseInt(st.nextToken());
		yang_limit = Integer.parseInt(st.nextToken());
		hura_limit = Integer.parseInt(st.nextToken());
		
		// 최소 치킨 수
		int min = Integer.min(hura_limit,yang_limit);
		int abs = Math.abs(hura_limit - yang_limit);
		
		// 뭐가 더 많은지 1 - 후라이드, 0 - 양념
		int check = hura_limit > yang_limit ? 1 : 0;
		
		// 반반 치킨이 더 쌀 때
		if(hura+yang > 2 * ban) {
			ban_count = 2 * min;
			answer += ban_count * ban;
			if(check == 1) {
				// 후라이드가 더 많고 2*반반 보다 비쌀 때
				if(hura * abs > 2* ban * abs ) {
					answer += 2*ban*abs;
				}else {
					answer += hura * abs;
				}
			}else {
				// 양념이 더 많고 2*반반 보다 비쌀 때
				if(yang * abs > 2* ban * abs ) {
					answer += 2*ban*abs;
				}else {
					answer += yang * abs;
				}
			}
		}else if(hura+yang < 2 * ban){
			answer += hura*hura_limit;
			answer += yang*yang_limit;
		}
		
		
		System.out.println(answer);
	}	
}