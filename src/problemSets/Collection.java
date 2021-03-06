package problemSets;

import java.util.Comparator;

public class Collection <T extends Comparable> implements Cloneable{

	private T[] array;
	private int size;
	private int capacity;
	
	Collection(){
		array = (T[]) new Object[capacity];
		size = 0;
		capacity = 10;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void addToEnd(T addition) {
		if (size == capacity) {
			T[] tempArray = (T[]) new Object[capacity];
			tempArray = array;
			capacity *= 2;
			array = (T[]) new Object[capacity];
		}
		array[size] = addition;
		size++;
	}
	
	public boolean contains(T object) {
		int position = 0;
		//important to put 
		while(position < array.length && !array[position].equals(object) ) {
			position++;
		}
		return array[position] != null;
	}
	
	public T findMin() {
		T smallest = array[0];
		for(int i = 1; i < size; i++) {
			if(array[i].compareTo(smallest) < 0) {
				smallest = array[i];
			}
		}
		return smallest;
	}
	
	public Collection <T> clone() {
		Collection <T> clone = new Collection <T>();
		for(int i = 0; i < size; i++) {
			clone.addToEnd(array[i]);
		}
		return clone;
	}
	
	private static class Inner{
		int memberVariable;
		int otherMemberVariable;
	}
}
