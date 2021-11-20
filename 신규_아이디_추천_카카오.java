package programus;
class Solution {
    public String solution(String new_id) {

       //1번
        new_id = new_id.toLowerCase();
        //2번
        new_id = new_id.replaceAll("[^a-z-_.0-9]","");
        //3번
        new_id = new_id.replaceAll("[.]+", ".");
        //4번
        if(new_id.endsWith(".")||new_id.startsWith(".")) {
            while (new_id.indexOf(".") == 0) {
            new_id = new_id.replaceFirst(".", "");
            if(new_id.length()==0) {
                break;
            }
        }
        while (new_id.lastIndexOf(".") == new_id.length() - 1) {
            if (new_id.length() == 1 || new_id.length() == 0) {
                new_id = new_id.replace(".","");
                break;
            }
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        }
        //5번
        if (new_id.isBlank()) {
            new_id = "a";
        }
        //6번
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            while (new_id.lastIndexOf(".") == new_id.length() - 1) {
                if (new_id.length() == 1 || new_id.length() == 0) {
                    new_id = new_id.replace(".","");
                    break;
                }
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        //7번
        if (new_id.length() <= 2) {
            while (new_id.length() < 3) {
                new_id += new_id.substring(new_id.length() - 1);
                if(new_id.length()==3) {
                    break;
                }
            }
        }

        String answer = new_id;
        return answer;
    }
}