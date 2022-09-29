class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0]!=b[0]){
                    return b[0]-a[0];
                }
                return b[1]-a[1];
            }
        });
        for(int i:arr){
            pq.add(new int[]{Math.abs(i-x),i});
            if(pq.size()>k){pq.poll();}
        }
        List<Integer> l = new ArrayList<>();
        while(!pq.isEmpty()){
            l.add(pq.poll()[1]);}
        Collections.sort(l);
        return l;
        }
    }
