package algolism;
import java.util.*;
class Solution {
    public int solution(String name) {

        int answer =0;
        int index =0;
        int last =0;
        int count = name.length()-1;
        int move =0;
        int target = 0;
        int a =1;
        // 알파벳별 가중치
        Map<String,Integer> map = new HashMap<>();
        map.put("A",0); map.put("B",1); map.put("C",2);
        map.put("D",3); map.put("E",4); map.put("F",5);
        map.put("G",6); map.put("H",7); map.put("I",8); 
        map.put("J",9); map.put("K",10); map.put("L",11); 
        map.put("M",12);map.put("N",13); map.put("O",12); 
        map.put("P",11);map.put("Q",10); map.put("R",9); 
        map.put("S",8); map.put("T",7); map.put("U",6); 
        map.put("V",5); map.put("W",4); map.put("X",3); 
        map.put("Y",2); map.put("Z",1); 
        // 알파벳 가중치의 합
        for(int i=0; i<name.length();i++) {
            target = map.get(String.valueOf(name.charAt(i)));
            answer += target;
        }
        // 오른쪽으로 갈때의 count
        while(String.valueOf(name.charAt(name.length()-a)).equals("A")) {
            count -= 1;
            a++;
        }
        //왼쪽으로 갈때의 count(move)
        if(name.contains("A")) {
            String s ="";
            if(name.indexOf("A")==0) {
                s = name.substring(name.indexOf("A",1));
                last = name.indexOf("A",1) + acount(s);
                index = name.indexOf("A",1)-1;
            }else {
                s = name.substring(name.indexOf("A"));
                last = name.indexOf("A") + acount(s);
                index = name.indexOf("A")-1;
            }
            move = index + index + (name.length()-last);
        }
        if(move == count) {
            answer += count;
            return answer;
        }
        //오른쪽 왼쪽 중에 작은 값을 추출
        if(move != 0) {
            move = Math.min(move,count);
        }else {
            move = count;
        }
        // 가중치와 이동거리의 합 리턴
        return answer+move;
    }
    public static int acount(String name) {

        int acount =0;
        for(int i=0; i<name.length(); i++) {
            if(!String.valueOf(name.charAt(i)).equals("A")) {
                break;
            }
            acount += 1;
        }

        return acount;
    }
}
