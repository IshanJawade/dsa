import java.util.*;

public class test{

	public void sortColors(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

		int index = 0; 
		int count = map.getOrDefault(0, 0);
		for(int i = 0; i < couit; i++) {
			array[index++] = 0;
		}
		count = map.getOrDefault(1, 0);
        for(int i = 0; i < count; i++) {
			array[index++] = 1;
		}
		count = map.getOrDefault(2, 0);
		for(int i = 0; i < count; i++) {
			array[index++] = 2;
		}
    }

	public static void main(String[] args) {
		
	}

}
