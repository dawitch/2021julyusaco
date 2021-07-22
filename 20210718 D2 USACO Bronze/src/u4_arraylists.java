import java.util.ArrayList;

public class u4_arraylists {

	public static void main(String[] args) {
		// similar to lists in python,
		// you can change the length or adjust more of the list not like in arrays
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(2021);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(2021);

		System.out.println(list1);
		System.out.println(list2);

		System.out.println(list1 == list2); // compares if they're equal
		System.out.println(list1.equals(list2)); // functions that show what values are equal
		// arraylists are still implemented by arrays
		// removal and adding of some values in between can cause shifting
	}

}
