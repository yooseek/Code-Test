package algolism;

import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static String[] data;
	static String[] kakao = {"A", "C", "F", "J", "M", "N", "R", "T"};
	static List<Condi> conditions;
	static String[] answer;
	static int count;
	public static void main(String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		n =2;
		data = new String[] {"M~C<2", "C~M>1"};
		conditions = new ArrayList<>();
		int[] check = new int[8];
		int[] temp = new int[8];
		answer = new String[8];
		
		// 조건 객체 리스트 생성
		condition(data);
		// 완전 탐색
		per(0,8,check,temp);
		System.out.println(count);
	}
	// 조건 객체 리스트 생성
	public static void condition(String[] data) {
		for(int i=0; i<n;i++) {
			conditions.add(new Condi(String.valueOf(data[i].charAt(0)),String.valueOf(data[i].charAt(2)),String.valueOf(data[i].charAt(3)),Integer.parseInt(String.valueOf(data[i].charAt(4)))));
		}
	}
	// 완전 탐색
	public static void per(int level,int r, int[] check, int[] temp) {
		if(level == r) {
			String n1 = "";
			String n2 = "";
			int num1 = 0;
			int num2 = 0;
			// 조건 갯수만큼 반복
			for(int i=0;i<n;i++) {
				n1 = conditions.get(i).name1;
				n2 = conditions.get(i).name2;
				// 순열 생성
				for(int j =0; j< 8; j++) {
					answer[j] = kakao[temp[j]];
					if(answer[j].equals(n1)) num1 = j;
					if(answer[j].equals(n2)) num2 = j;
				}
				// 만들어진 순열에 조건 비교
				if(!ch(conditions.get(i).con,num1,num2,conditions.get(i).val)) {
					return;
				}
			}
			count++;
			return;
		}
		for(int i =0;i<8;i++) {
			if(check[i] == 0) {
				check[i] = 1;
				temp[level] = i;
				per(level+1,r,check,temp);
				check[i] = 0;
			}
		}
	}
	// 조건 비교
	public static boolean ch (String condi,int a, int b,int val) {
		if(condi.equals("=")) {
			if(Math.abs(a-b)-1 == val) return true;
			else return false;
		}else if(condi.equals(">")) {
			if(Math.abs(a-b)-1 > val) return true;
			else return false;
		}else if(condi.equals("<")){
			if(Math.abs(a-b)-1 < val) return true;
			else return false;
		}
		return false;
	}
}
class Condi {
	String name1;
	String name2;
	String con;
	int val;
	Condi (String n1, String n2, String con, int v){
		this.name1 = n1;
		this.name2 = n2;
		this.con = con;
		this.val = v;
	}
}