package programus;
import java.util.*;
class Solution {
    public String[] solution(String[] record) {

        String[] a ;

        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<String> list3 = new ArrayList<String>();

        Map<String,String> map = new HashMap<String,String>();
        String id = "";
        int count =0;
        for(String s : record) {
            a = s.split(" ");
            id = a[1];
            list.add(a[0]);
            list2.add(a[1]);
            if(a[0].equals("Enter") || a[0].equals("Change")) {
                map.put(id,a[2]);
                count ++;
            }
        }

        for(int i=0;i<list.size();i++) {
            if(list.get(i).equals("Enter")) {
                list3.add(map.get(list2.get(i))+"´ÔÀÌ µé¾î¿Ô½À´Ï´Ù."); 
            }else if(list.get(i).equals("Leave")) {
                list3.add(map.get(list2.get(i))+"´ÔÀÌ ³ª°¬½À´Ï´Ù."); 
            }
        }
        String[] answer = new String[list3.size()];
        list3.toArray(answer);


        return answer;
    }
}