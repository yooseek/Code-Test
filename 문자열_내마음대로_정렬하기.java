package programus;
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {

        List<String> list = new ArrayList<>();
        for(String s : strings){
            list.add(change(s,n));
        }
        // ����
        Collections.sort(list);
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
    // ù��° ���ڸ� ���� �տ� �߰�
    public static String change(String s, int n){
        StringBuilder sb = new StringBuilder(s);

        sb.insert(0,sb.charAt(n));
        return sb.toString();
    }
}
