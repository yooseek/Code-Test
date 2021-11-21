package algolism;

import java.util.*;

public class Main {

	public String Solution(String st) {
		
		List<String> list = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();
		// �ϰ����� �ڸ��� �������� ��ȯ
		int seven = 7;
		while(!st.isEmpty()) {
			String str = st.substring(0,seven).replace("#","1").replace("*","0");
			list.add(str);
			st = st.substring(seven);
		}
		//�� �ƽ�Ű�ڵ�� ��ȯ �� ���� ��ȯ
		StringBuilder sb = new StringBuilder();
		for(String s: list) {
			sb.append((char)Integer.parseInt(s,2));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String str = sc.next();
		
		System.out.println(T.Solution(str));
	}
}