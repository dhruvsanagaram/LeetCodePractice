class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, List<Integer>> pattern_map = new HashMap<>();
        HashMap<String, List<Integer>> s_map = new HashMap<>();

        String[] s_arr = s.split(" ");

        if(s_arr.length != pattern.length()){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            if(pattern_map.containsKey(pattern.charAt(i))){
                pattern_map.get(pattern.charAt(i)).add(i);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                pattern_map.put(pattern.charAt(i),list);
            }
        }

        for(int i = 0; i < s_arr.length; i++){
            if(s_map.containsKey(s_arr[i])){
                s_map.get(s_arr[i]).add(i);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                s_map.put(s_arr[i], list);
            }
        }

        for(int i = 0; i < s_arr.length; i++){
            if(!s_map.get(s_arr[i]).equals(pattern_map.get(pattern.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
