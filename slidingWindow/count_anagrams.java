package slidingWindow;

import java.util.*;

public class count_anagrams {
    static int countAnagrams(String s, String k){
        Map<Character, Integer> map = new HashMap<>();
        char[] strArr = s.toCharArray();
        char[] kArr = k.toCharArray();

        //create hashMap to save character and its count
        for(char c: kArr){
            // this line will check if c is there or not
            // if its not then will put c with default value 0 (c:0)
            // if its there then it will just increace the value by 1 
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = map.size();

        // create window
        int i=0, j=0;
        while(j < kArr.length){
            char currentChar = strArr[j];
            if(map.containsKey(strArr[j])){
                map.put(currentChar, map.get(currentChar)-1);
                if(map.get(currentChar)== 0){
                    count --;
                }
            }

        }

        // slide the windows through the array
        while(j < strArr.length){
            if(map.)
        }


        return 0;
    }
    public static void main(String[] args) {
        String str = "aabaaabaabb";
        String k = "aaba";
        System.out.println(countAnagrams(str, k));
    }
}
