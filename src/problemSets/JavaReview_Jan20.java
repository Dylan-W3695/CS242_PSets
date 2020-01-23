package problemSets;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;

public class JavaReview_Jan20 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String errorMessage = "This program needs a command line argument to run";
		if(args.length < 1) {
			System.out.println(errorMessage);
		}
		else {
			readFile(args[1]);
		}
		
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
	
	public static void printCommandArgs(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	
	public static void readFile(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
	}
}
