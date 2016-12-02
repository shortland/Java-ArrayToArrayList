import java.util.ArrayList;

public class ArrayToAL {

	public static void main(String[] args) {
		int[] theList = {2, 4, 6, 8, 10, 12, 14, 16, 18};

		/*
		// This is how you would add values to ArrayList using a loop, the rest of code is doing this with recursion

		ArrayList<Integer> newThing = new ArrayList<Integer>();
		for(int i = 0; i < theList.length; i++) {
			newThing.add(theList[i]);
		}
		System.out.println(newThing.get(0));
		System.out.println(newThing.get(1));

		*/

		// show that something(theList) is infact an ArrayList that holds the old Array values
		System.out.println(something(theList).get(0));
		System.out.println(something(theList).get(1));
	}

	public static ArrayList<Integer> something(int[] theList) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		return something(newList, theList, 0);
	}

	public static ArrayList<Integer> something(ArrayList<Integer> newList, int[] oldList, int pos) {
		if(pos == oldList.length)
			return newList;
		else {
			newList.add(oldList[pos]);
			return something(newList, oldList, pos+1);
		}
	}

}