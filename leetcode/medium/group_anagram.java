package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class group_anagram {
	
	public static List<List<String>> findGroupAnagram(String[] strs){
		List<List<String>> result = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for(String tempString: strs){
			char[] charArray = tempString.toCharArray();
			Arrays.sort(charArray);
			String sortedString = new String(charArray);
			if(map.containsKey(sortedString) == false){
				map.put(sortedString, new ArrayList<>());
			}
			map.get(sortedString).add(tempString);
		}
		System.out.println(map);
		result.addAll(map.values());
		return result;
	}

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(findGroupAnagram(strs));
	}
}
