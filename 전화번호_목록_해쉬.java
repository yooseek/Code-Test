package algolism;
import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
            HashMap<String, Integer> hashMap = new HashMap<>();

            for (String number : phone_book) hashMap.put(number, 0);
            for (String key : hashMap.keySet())
                for (int j = 1; j <= key.length() - 1; j++)
                    if (hashMap.containsKey(key.substring(0, j))) return false;
            return true;
    }
}