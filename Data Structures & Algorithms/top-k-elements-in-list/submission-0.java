class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer x: nums){
            if(map.get(x)!=null){
                map.put(x,map.get(x)+1);
            }
            else{
              map.put(x,1);  
            }
        }

        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->map.get(b)-map.get(a));

        for(int num: map.keySet()){
            pq.offer(num);
        }

        int[] array = new int[k];
        for(int i=0;i<k;i++){
            array[i]=pq.poll();
        }

        return array;
        
    }
}
