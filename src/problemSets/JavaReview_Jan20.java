package problemSets;

public class JavaReview_Jan20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public <T> int count(T object, T[] objectArray) {
		int count = 0;
		for (int i = 0; i < objectArray.length; i++) {
			if (object.equals(objectArray[i])) {
				count++;
			}
		}
		return count;
	}
	
	
}
