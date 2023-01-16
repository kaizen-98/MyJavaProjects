package randomTopic;

import java.util.Arrays;

public class TheFristQustion {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int[] numbers1 = { 1, 2, 5, 5, 5, 6 };
		int[] numbers2 = { 1, 2, 3, 4, 2, 1 };
		Arrays.sort(numbers);
		Arrays.sort(numbers1);
		Arrays.sort(numbers2);
		System.out.println(" The maximum Product "+MaxProdect(numbers));
		System.out.println(" The maximum Product "+MaxProdect(numbers1));
		System.out.println(" The maximum Product "+MaxProdect(numbers2));
		
		
	}
	public static int MaxProdect(int[] numbers) {
		int total  = 1;
		for (int i =2; i< numbers.length; i++) {
			total = total * numbers[i];
		}
		return total;
	}
}
