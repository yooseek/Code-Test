package programus;
class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;

        //5�� �׽�Ʈ���̽� ����
        //���������� : i < s.length()
        //���� : i<=s.length()
        for(int i=1; i<=s.length(); i++){
            String str = encoding(s, i, answer);
            if(str != null)
                answer = Math.min(answer, str.length());
        }

        return answer;
    }

    String encoding(String s, int slice, int max){ 
        StringBuilder sb = new StringBuilder();
        String prev = "";
        int cnt = 0;
        int idx = 0; 

        while(idx+slice <= s.length()){
            String cur = s.substring(idx, idx+slice);

            if(prev.compareTo(cur) != 0){
                if(prev.compareTo("") != 0){
                    if(cnt != 1)    sb.append(cnt);
                    sb.append(prev);
                }

                prev = cur;
                cnt = 1;
            }else{
                cnt++;
            }
            idx += slice;

            //���̰� �ִ���̺��� ��ٸ� �� �� �ʿ�� ����
            if(sb.length() >= max)
                return null;
        }
        //�������� ���� ���ڿ� ���̱�
        if(idx <= s.length()){
            if(cnt != 1)
                sb.append(cnt+prev+s.substring(idx));
            else
                sb.append(prev+s.substring(idx));
        }

        return sb.toString();
    }
}