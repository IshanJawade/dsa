package leetcode.medium;

public class remove_all_occurence_of_substring {

	// same logic but simple method by using StringBuilder features
	static String removeOccurrences(String s, String part) {
		// put given string in the stringbuilder
		StringBuilder arr = new StringBuilder(s);
		// StringBuilder feature : indexOf()
		// returns the index of first occurence of the parameter string in the stringbuilder
		// if not found return -1
		int index = arr.indexOf(part);

		// in the loop we are updating value of index
		// meaning = run loop untill index returns -1
		while(index != -1){
			// delete the section from index till length of pattern we are searching
			arr.delete(index, index+part.length());
			// update the value of index by checking if there is pattern in arr
			index = arr.indexOf(part);
		}
		return arr.toString();
	}

	// complecated method --- incomplete implimentation but logic is correct
	static String removeOccurrencesComplex(String s, String part) {
        //put part in a stringbuilder
        StringBuilder arr = new StringBuilder();
        StringBuilder str = new StringBuilder();
        StringBuilder pat = new StringBuilder();
		arr.append(s);
		pat.append(part);

        // create a sliding window
        int i=0, j=0;
        while(j < part.length()){
			str.append(arr.charAt(j));
            j++;
        }
		// slid the window through the array
		// check if parttern is qual to string window
		while(j < arr.capacity()){
			if(pat.compareTo(str) == 0){
				str.delete(i, j);
				arr.delete(i, j);
				i=0; j=0;
				while(j < part.length()){
					str.append(arr.charAt(j));
					j++;
				}
			} else {
				str.deleteCharAt(i);
				i++;
				str.append(arr.charAt(j));
				j++;
			}
		}
		return arr.toString();
    }
		public static void main(String[] args) {
		String s = "daabcbaabcbc";
		String part = "abc";
		System.out.println(removeOccurrences(s, part));
	}
}
