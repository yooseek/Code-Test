package programus;
class Solution {
    public int solution(String s) {

        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        // 문자열길이만큼 회전
        for(int i=0;i<sb.length();i++) {
            if(check(sb) == 0) {
                count += 1;
            }
            sb = change(sb);
        }

        return count;
    }
    // 올바른 괄호 문자열인지 체크
    public static int check(StringBuilder sb) {

        String s = sb.toString();
        while(s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s = s.replace("{}","");
            s = s.replace("()","");
            s = s.replace("[]","");
        }
        if(s.length() != 0) {
            return 1;
        }
        return 0;
    }
    // 왼쪽으로 한칸 돌리기
    public static StringBuilder change(StringBuilder sb) {

        sb.append(sb.charAt(0));
        sb = new StringBuilder(sb.substring(1));

        return sb;
    }
}