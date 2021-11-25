package algolism;
import java.util.*;
import java.util.regex.Pattern;
class Solution {
    public int solution(String str1, String str2) {

        if(str1.isEmpty() & str2.isEmpty()) {
            return 1;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        String pattern = "^[a-z]*$"; //¹®ÀÚ¸¸

        boolean regex = false;

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        int start = 0;
        int end = 2;
        while(true) {
            regex = Pattern.matches(pattern,str1.substring(start,end));
            if(regex) {
                list1.add(str1.substring(start,end));
            }
            start += 1;
            end += 1;
            if(end>=str1.length()) {
                regex = Pattern.matches(pattern,str1.substring(start));
                if(regex) {
                    list1.add(str1.substring(start));
                }
                break;
            }
        }
        start = 0;
        end = 2;
        while(true) {
            regex = Pattern.matches(pattern,str2.substring(start,end));
            if(regex) {
                list2.add(str2.substring(start,end));
            }
            start += 1;
            end += 1;
            if(end>=str2.length()) {
                regex = Pattern.matches(pattern,str2.substring(start));
                if(regex) {
                    list2.add(str2.substring(start));
                }
                break;
            }
        }
        double cross = 0;
        double plus =0;

        if(list1.size() > list2.size()) {
            for(int i =0; i<list2.size();i++) {
                if(list1.contains(list2.get(i))) {
                    cross +=1;
                    list1.remove(list2.get(i));
                }   
            }
            plus = list1.size() + list2.size();

        }else {
            for(int i =0; i<list1.size();i++) {
                if(list2.contains(list1.get(i))) {
                    cross +=1;
                    list2.remove(list1.get(i));
                }
            }
            plus = list2.size()+list1.size();

        }
        if(list1.isEmpty() & list2.isEmpty()){
            return 65536;
        }
        if(cross==0){
            return 0;
        }else{
            double a = cross/plus;
            int answer = (int) (65536*a);
            return answer;
        }
    }
}
