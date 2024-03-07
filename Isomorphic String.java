class Solution {
    public boolean isIsomorphic(String s, String t) {
        //algorithm
        //construct the two maaps for each string where the keys aare the indices
        //and the values are the occurence indices of that character
        //check if the two maps are equal

        HashMap<Character, List<Integer>> s_freqs= new HashMap<>();
        HashMap<Character, List<Integer>> t_freqs= new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(s_freqs.containsKey(s.charAt(i))){
                s_freqs.get(s.charAt(i)).add(i);    //if we find a character 
                                                    //we've found before, add
                                                    //index to the list
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                s_freqs.put(s.charAt(i), list);
            }
        }
        // s_freqs.forEach((key, value) -> System.out.println(key + " " + value));

        for(int i = 0; i < t.length(); i++){
            if(t_freqs.containsKey(t.charAt(i))){
                t_freqs.get(t.charAt(i)).add(i);    //if we find a character 
                                                    //we've found before, add
                                                    //index to the list
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                t_freqs.put(t.charAt(i), list);
            }
        }
        // t_freqs.forEach((key, value) -> System.out.println(key + " " + value));

        for(int j = 0; j < s.length(); j++){
            // System.out.println(s_freqs.get(s.charAt(j)));
            // System.out.println(t_freqs.get(t.charAt(j)));
            if(!s_freqs.get(s.charAt(j)).equals(t_freqs.get(t.charAt(j)))){
                return false;
            }
        }
        return true;
    }
}
