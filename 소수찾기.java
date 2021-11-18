package programus;
import java.util.*;
class Solution {
    static HashSet<Integer> list =new HashSet<Integer>();
    static String[] number;
    public int solution(String numbers) {

        number = numbers.split("");
        String[] temp = new String[number.length];
        boolean[] visit = new boolean[number.length];
        int answer = 0;
        for(int i=1;i<=number.length;i++) {
            makePermutation(i,temp,0,visit);
        }
        list.remove(1);
        list.remove(0);

        for(int i : list) {
            if(check(i)) {
                answer +=1;
            }
        }
        return answer;
    }
        // 반복 함수
    private static void makePermutation(int r, String[] temp, int current,boolean[] visited) {
        if (r == current) {
            String s= "";
            for(String i: temp) {
                if(i != null ) {
                    s+=i;
                }
            }
            list.add(Integer.parseInt(s));
        } else {
            for (int i = 0; i < number.length; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    temp[current] = number[i];
                    makePermutation(r, temp, current +1, visited);
                    visited[i] = false;
                }
            }
        }
    }
    public static boolean check(int num) {

            for(int i = 2; i<num;i++) {
                if(num%i==0) {
                    return false;
                }
            }
            return true;
    }
}