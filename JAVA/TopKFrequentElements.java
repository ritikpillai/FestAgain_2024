import java.util.*;

public class TopKFrequentElements {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Create a frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a priority queue (min-heap) based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );

        // Add entries to the min-heap
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            // Ensure the size of the heap does not exceed k
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Extract the k most frequent elements
        List<Integer> topKElements = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            topKElements.add(minHeap.poll().getKey());
        }

        // The result can be returned in any order
        return topKElements;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> result = topKFrequent(nums, k);

        System.out.println("Top " + k + " Frequent Elements: " + result);
    }
}
