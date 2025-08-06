package leetcode.medium;

import java.util.*;

public class time_based_key_value_store {
	// custome data structure
	class Pair{
		Integer timestamp;
		String value;

		public Pair(String value, Integer timestamp){
			this.value = value;
			this.timestamp = timestamp;
		}
	}

	class TimeMap{
		Map<String, List<Pair>> map;

		public TimeMap(){
			map = new HashMap<>();
		}

		public void set(String key, String value, int timestamp) {
			Pair pair = new Pair(value, timestamp);
								//	lamda function
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(pair);
    	}
    
    	public String get(String key, int timestamp) {
			List<Pair> values = map.getOrDefault(key, new ArrayList<>());
			int left = 0;
			int right = values.size() - 1; 
			String result = "";

			while(left <= right){
				int mid = left + (right - left) / 2;
				if(values.get(mid).timestamp <= timestamp){
					result = values.get(mid).value;
					left = mid +1;
				} else {
					right = mid -1;
				}
			}
			return result;
    	}
	}

}
