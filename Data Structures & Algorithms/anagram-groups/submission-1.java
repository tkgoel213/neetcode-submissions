class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character, Integer>, ArrayList<String>> bm = new HashMap<>();

        for (String x : strs) {

            HashMap<Character, Integer> fmap = new HashMap<>();

            for (char c : x.toCharArray()) {

                if (fmap.containsKey(c)) {
                    fmap.put(c, fmap.get(c) + 1);
                } else {
                    fmap.put(c, 1);
                }
            }

            if (bm.containsKey(fmap)) {
                bm.get(fmap).add(x);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(x);
                bm.put(fmap, list);
                //break the code and logic-bm.put(fmap,list.add(x)) will not work as list.add() returns boolean//
            }
        }

        return new ArrayList<>(bm.values());
    }
}
