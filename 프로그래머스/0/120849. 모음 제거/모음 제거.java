class Solution {
    public String solution(String my_string) {
        String[] vowels = new String[]{"a","e","i","o","u"};
        for (String v : vowels) {
            my_string = my_string.replace(v, "");
        }
        return my_string;
    }
}