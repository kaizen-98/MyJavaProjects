package randomTopic;

public class Task7 {

	public static void main(String[] args) {

		int[] numbers = { 5, 10, 20, 25, 30 };
		System.out.println("The Total is  "+FindNumber(numbers));
	}

	public static int FindNumber(int[] numbers) {
		int total = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (numbers[i] + 5 != numbers[j]) {
					total = numbers[i] + 5;
				}
			}
			//System.out.println();
		}
		return total;
		
	}
}
