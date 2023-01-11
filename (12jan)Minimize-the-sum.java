class Solution {
    long minimizeSum(int N, int arr[]) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long num:arr){
            pq.add(num);
        }
        long ans =0;
        while(pq.size()>1){
            long num1 = pq.poll();
            long num2 = pq.poll();
            long sum = num1+num2;
            ans = ans + sum;
            pq.add(sum);
            
        }
        return ans;
    }
}
