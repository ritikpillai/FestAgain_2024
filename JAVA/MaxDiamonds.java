

class Solution {
    
    static long maxDiamonds(int[] A, int N, int K) {
        long sum = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            queue.add(A[i]);
        }

        for (int i = 0; i < K; i++) {
            int max = queue.poll();
            sum += max;
            queue.add(max / 2);
        }

        return sum;
    }
}
