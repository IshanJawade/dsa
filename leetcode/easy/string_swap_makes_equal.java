package leetcode.easy;

public class string_swap_makes_equal {
    static boolean areAlmostEqual(String s1, String s2) {
        // edge cases
        if(s1.equals(s2)) return true;

        // chcecking if 2 strings have same length if not then return false
        if(s1.length() == s1.length()){

            // putting 2 strings in 2 diff char arrays
            char[] Arr1 = s1.toCharArray();
            char[] Arr2 = s2.toCharArray();
            int count = 0;  // variable to count miss matches
            int[] miss = new int[2]; // variable to store indices of miss matches

            // iterating for checking missmatches and store the index into miss array 
            for(int i=0; i<Arr1.length; i++){
                if(!(Arr1[i] == Arr2[i])){
                    // if count is under 2 then save index into miss array
                    if(count < 2){
                        miss[count] = i; 
                    }
                    count++;
                }
            }

            // checking if array is of size 2 or return false
            if(count == 2){
                
                // checking if those 2 missmatched elements are same 
                if(Arr1[miss[0]] == Arr2[miss[1]] && 
                    Arr1[miss[1]] == Arr2[miss[0]]){
                    return true;
                }
                return false;
            }
                
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "gamer";
        String s2 = "gemar";
        System.out.println(areAlmostEqual(s1, s2));
    }
}
