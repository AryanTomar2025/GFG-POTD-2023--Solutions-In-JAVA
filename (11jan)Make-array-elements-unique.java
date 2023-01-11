class Solution {
    public long minIncrements(int[] arr, int N) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<N;i++){
            if(!set.contains(arr[i])) 
                set.add(arr[i]);
            else {
                int duplicate = arr[i];
                while(set.contains(duplicate)){
                  duplicate++;
                  count++;
                }
                set.add(duplicate);
            }        
        }
      return count;  
    }
}

