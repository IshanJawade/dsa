package leetcode.medium;


import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class top_k_frequent_element {
	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> hashMap = new TreeMap<>();
		for(int i: nums){
			hashMap.put(i, hashMap.getOrDefault(i, 0)+1);
		}
		System.out.println(hashMap);
		
		Queue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
			(a,b) -> b.getValue() - a.getValue()
		);
		for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
			pq.offer(entry);
		}
		System.out.println(pq);
		
		int[] output = new int[k];
		for(int i=0; i < k; i++){
			output[i] = pq.poll().getKey();
		}
        return output;
    }
	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3,3,3,3};
		int k = 2;
		System.out.println(topKFrequent(nums, k));
	}
}
