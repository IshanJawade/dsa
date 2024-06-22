package collections;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMaps {
    public static void main(String[] args) {

        //  HashMap
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        
        numbers.put("One", 25); // This will override first key with this new value
        
        numbers.putIfAbsent("One", 30); // this will check if the key is already present if not it will add


        System.out.println(numbers);

        // To print whole pairs
        for(Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.print("Key: "+e.getKey());
            System.out.print(" Value: "+e.getValue()+"\n");
            System.out.println(e);
        } 

        //  To Print only keys
        for(String key: numbers.keySet()){
            System.out.println(key);
        }

        // To print only values
        for(int val: numbers.values()){
            System.out.println(val);
        }

        //  TreeMap - Same as hashmap but in the backend binary tree implemented and keys and values gets sorted
        Map<String, Integer> TreeNums = new TreeMap<>();
        TreeNums.put("One", 1);
        TreeNums.put("Two", 2);
        TreeNums.put("Three", 3);
        TreeNums.put("Four", 4);
        TreeNums.put("Five", 5);

        System.out.println(TreeNums);

    }
}
