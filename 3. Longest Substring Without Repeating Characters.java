class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        // using concept of sliding window
        for (int end = 0; end < s.length(); end++) {
            char chr = s.charAt(end);
            
            // check if the character is already in the hashmap 
            // here second condition is like 'is that char which is duplicated comes after my start as my start moves forward'
            // 'also that duplicate can be start itself that why use of >='
            if (map.containsKey(chr) && map.get(chr) >= start) {
                // then update start to next index 
                start = map.get(chr) + 1;
            }
            
            // now set the max length again 
            maxLength = Math.max(maxLength, end - start + 1);
            
            map.put(chr,end);
        }
        
        return maxLength;
    }   
}