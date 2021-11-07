package algolism;
import java.util.*;
class Solution {
    public int solution(String dartResult) {

        List<Integer> list = new ArrayList<>();

        for(int i =0; i<dartResult.length();i++) {
            //S , D , T 일때 값 계산
            if(String.valueOf(dartResult.charAt(i)).equals("S")) {
                if(String.valueOf(dartResult.charAt(i-1)).equals("0")& i>=2) {
                    if(String.valueOf(dartResult.charAt(i-2)).equals("1")) {
                        list.add((int)Math.pow(10,1));
                    }else {
                        list.add((int)Math.pow(Double.parseDouble(String.valueOf(dartResult.charAt(i-1))),1));
                    }
                }else {
                    list.add((int)Math.pow(Double.parseDouble(String.valueOf(dartResult.charAt(i-1))),1));
                }
            }
            if(String.valueOf(dartResult.charAt(i)).equals("D")) {
                if(String.valueOf(dartResult.charAt(i-1)).equals("0")& i>=2) {
                    if(String.valueOf(dartResult.charAt(i-2)).equals("1")) {
                        list.add((int)Math.pow(10,2));
                    }else {
                        list.add((int)Math.pow(Double.parseDouble(String.valueOf(dartResult.charAt(i-1))),2));
                    }
                }else {
                    list.add((int)Math.pow(Double.parseDouble(String.valueOf(dartResult.charAt(i-1))),2));
                }
            }

            if(String.valueOf(dartResult.charAt(i)).equals("T")) {
                if(String.valueOf(dartResult.charAt(i-1)).equals("0")& i>=2) {
                    if(String.valueOf(dartResult.charAt(i-2)).equals("1")) {
                        list.add((int)Math.pow(10,3));
                    }else {
                        list.add((int)Math.pow(Double.parseDouble(String.valueOf(dartResult.charAt(i-1))),1));
                    }
                }else {
                    list.add((int)Math.pow(Double.parseDouble(String.valueOf(dartResult.charAt(i-1))),3));
                }
            }
            // 옵션들 값 계산
            if(String.valueOf(dartResult.charAt(i)).equals("*")) {
                list.set(list.size()-1,list.get(list.size()-1)*2);
                if(list.size()-1 != 0) {
                    list.set(list.size()-2,list.get(list.size()-2)*2);
                }
            }
            if(String.valueOf(dartResult.charAt(i)).equals("#")) {
                list.set(list.size()-1,list.get(list.size()-1)*-1);
            }
        }
        int answer = 0;

        for(int i : list) {
            answer += i;
        }

        return answer;
    }
}