package randomTopic;

import java.util.Arrays;

public class ThirdQustion {

	public static void main(String[] args) {
		int[] numbers = {1, 5, 9, 3, 7, 8, 2, 4, 6};
		Arrays.sort(numbers);
		System.out.println(" The third highest number in the array "+HighestNumber(numbers));
	}
	public static int HighestNumber(int[] numbers) {
		int range  = 0;
		for(int i =0; i<numbers.length; i++) {
			range = numbers[i]-2;
		}
		return range;
	}

}
