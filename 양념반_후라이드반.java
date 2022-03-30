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
		
		// �ּ� ġŲ ��
		int min = Integer.min(hura_limit,yang_limit);
		int abs = Math.abs(hura_limit - yang_limit);
		
		// ���� �� ������ 1 - �Ķ��̵�, 0 - ���
		int check = hura_limit > yang_limit ? 1 : 0;
		
		// �ݹ� ġŲ�� �� �� ��
		if(hura+yang > 2 * ban) {
			ban_count = 2 * min;
			answer += ban_count * ban;
			if(check == 1) {
				// �Ķ��̵尡 �� ���� 2*�ݹ� ���� ��� ��
				if(hura * abs > 2* ban * abs ) {
					answer += 2*ban*abs;
				}else {
					answer += hura * abs;
				}
			}else {
				// ����� �� ���� 2*�ݹ� ���� ��� ��
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