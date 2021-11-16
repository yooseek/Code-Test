package programus;
import java.util.*;

class Solution {

    ArrayList<HashSet<Integer>> candidateKey;

    public int solution(String[][] relation){
        candidateKey = new ArrayList<>();
        int colSize = relation[0].length;

        for(int i = 1 ; i <= colSize ; ++i) {
            makeKeySet(-1, colSize - 1, 0, i, new HashSet<>(), relation);
        }

        return candidateKey.size();
    }

    private void makeKeySet(int attr, int maxAttr, int idx, int size, HashSet<Integer> keySet, String[][] relation) {
        if(idx == size) {

            for(int i : keySet) System.out.print(i + " ");

            for(HashSet<Integer> key : candidateKey) {
                if(keySet.containsAll(key)) {
                    System.out.println("�� " + key + "�� �����մϴ�.");
                    return;
                }
            }

            if(isUnique(keySet, relation)) {
                System.out.println("�� �ĺ�Ű �Դϴ�.");
                candidateKey.add(keySet);
            } else {
                System.out.println("�� �ĺ�Ű�� �ƴմϴ�.");
            }


            return;
        }

        for(int i = attr + 1 ; i <= maxAttr ; ++i) {
            HashSet<Integer> newKeySet = new HashSet<>(keySet);
            newKeySet.add(i);
            makeKeySet(i, maxAttr, idx + 1, size, newKeySet, relation);
        }
    }

    private boolean isUnique(HashSet<Integer> keySet, String[][] relation) {
        HashMap<String, String> map = new HashMap<>();

        for(int r = 0 ; r < relation.length ; ++r) {
            String key = "";

            for(int c : keySet) {
                key += relation[r][c];
            }

            if(map.containsKey(key)) return false;
            else map.put(key, key);
        }   
        return true;
    }
}