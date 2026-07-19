class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
                return false;
            }

        HashMap <Character, Integer> anagram = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            anagram.put(s.charAt(i), anagram.getOrDefault(s.charAt(i),0)+ 1);
            }

        

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            if(!anagram.containsKey(ch)){
                return false;
            }
            anagram.put(ch, anagram.get(ch) - 1);

            if(anagram.get(ch) == 0){
                anagram.remove(ch);
            }
        }
        return anagram.isEmpty();
    }
}