package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		
		// HashSets (Random Order)
		System.out.println("Hash Set ");
		Set<Integer> hSet = new HashSet<>();
		
		hSet.add(64);
		hSet.add(264);
		hSet.add(45);
		hSet.add(423);
		hSet.add(87);
		hSet.add(90);

		System.out.println(hSet);

		System.out.println(hSet.size());
		System.out.println(hSet.contains(45));
		System.out.println(hSet.isEmpty());

		hSet.clear();
		System.out.println(hSet);

		// LinkedHash Sets (here order matters)
		System.out.println("Linked Hash Set");
		Set<Integer> lHSet = new LinkedHashSet<>();
		
		lHSet.add(64);
		lHSet.add(264);
		lHSet.add(45);
		lHSet.add(423);
		lHSet.add(87);
		lHSet.add(90);

		System.out.println(lHSet);

		System.out.println(lHSet.size());
		System.out.println(lHSet.contains(45));
		System.out.println(lHSet.isEmpty());

		lHSet.clear();
		System.out.println(lHSet);

		// Treesets (All the elements are sorted by default and implemented binary tree structure in the backend)
		System.out.println("Tree Set");
		Set<Integer> tSet = new TreeSet<>();
		
		tSet.add(64);
		tSet.add(264);
		tSet.add(45);
		tSet.add(423);
		tSet.add(87);
		tSet.add(90);

		System.out.println(tSet);

		System.out.println(tSet.size());
		System.out.println(tSet.contains(45));
		System.out.println(tSet.isEmpty());

		tSet.clear();
		System.out.println(tSet);
		
	}
}
