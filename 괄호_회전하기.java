package programus;
class Solution {
    public int solution(String s) {

        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        // ���ڿ����̸�ŭ ȸ��
        for(int i=0;i<sb.length();i++) {
            if(check(sb) == 0) {
                count += 1;
            }
            sb = change(sb);
        }

        return count;
    }
    // �ùٸ� ��ȣ ���ڿ����� üũ
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
    // �������� ��ĭ ������
    public static StringBuilder change(StringBuilder sb) {

        sb.append(sb.charAt(0));
        sb = new StringBuilder(sb.substring(1));

        return sb;
    }
}