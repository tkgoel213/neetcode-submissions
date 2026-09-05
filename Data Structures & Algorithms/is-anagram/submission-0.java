class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character,Integer> m =new HashMap<>();
        for(char i : s.toCharArray()){
            if(m.get(i)!=null){
                m.put(i,m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
            
        }

        for(char i : t.toCharArray()){
            if(m.get(i) != null && m.get(i)>0){
                m.put(i,m.get(i)-1);
            }
            else{
                return false;
            }    
        }

        return true;


    }
}
