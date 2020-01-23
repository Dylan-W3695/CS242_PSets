package problemSets;

public class JavaReview_Jan20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static <T> int count(T object, T[] objectArray) {
		int count = 0;
		for (int i = 0; i < objectArray.length; i++) {
			if (object.equals(objectArray[i])) {
				count++;
			}
		}
		return count;
	}
	
	public void printCommandArgs(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
