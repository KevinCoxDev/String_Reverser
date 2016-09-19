import java.util.Scanner;

public class Reverse_String {
	
	private static Scanner reader;

	public static String reverseString(String input){
		String[] array = input.split("(?!^)"); // Splits string into array of characters
		
		for(int i = 0; i< input.length()/ 2; i++){
			String temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		
		return String.join("",array);
	}
	
	public static void main(String [] args){
		reader = new Scanner(System.in);
		String input = reader.nextLine();
		System.out.println(reverseString(input));
	}

}
