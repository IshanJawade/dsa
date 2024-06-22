package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass {
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();

		nums.add(23);
		nums.add(67);
		nums.add(76);
		nums.add(42);
		nums.add(87);
		nums.add(90);
		nums.add(34);

		System.out.println(Collections.min(nums));
		System.out.println(Collections.max(nums));

		System.out.println(nums);
		
		Collections.sort(nums);
		System.out.println(nums);
		
		Collections.sort(nums, Comparator.reverseOrder());
		System.out.println(nums);

	}
}
