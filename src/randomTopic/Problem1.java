package randomTopic;

import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int maxValue = FindTheBigger(numbers);
		System.out.println(" The maximum Product "+maxValue);
	}

	public static int FindTheBigger(int[] numbers) {
		Arrays.sort(numbers);
		int maxValue =  Math.max(numbers[0]*numbers[1]*numbers[2]*numbers[3],
				numbers[numbers.length-1]*numbers[numbers.length-2]*numbers[numbers.length-3]
						*numbers[numbers.length-4]
				);
		 return maxValue;
	}
}
