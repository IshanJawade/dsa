package collections;
import java.util.ArrayList;
import java.util.List;

// import javax.swing.text.html.HTMLDocument.Iterator;



public class Arrays {
	public static void main(String[] args) {

		List<String> Names = new ArrayList<>();

		Names.add("Ishan Jawade");
		Names.add("Ayushi Mohkar");
		Names.add("Puppy 500");
		Names.add("Shah Rukh Khan");

		Names.remove(0);
		Names.add(0, "Ishan Jawade");
		Names.addFirst("Akshay Kumar");
		Names.addLast("Aamir Khan");
		System.out.println(Names.size());
		System.out.println(Names.get(2));
		
		// Print type 1
		System.out.println(Names);
		
		// Print Type 2
		for(String i: Names){
			System.out.println(i);
		}

		// Print type 3
		// Iterator it = (Iterator) Names.iterator();

		// while(it.hasNext()){
		// 	System.out.println(it.hasNext());
		// }
		

	}
}
