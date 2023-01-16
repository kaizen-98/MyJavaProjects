package randomTopic;

public class FourthQstuion {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 6, 8, 10,9 };
		System.out.println("total = " + FindSum(numbers));

	}

	public static int FindSum(int[] numbers) {
		int sum =10;
		for (int i = 0; i<numbers.length; i++) {
			for (int j = i+1; j<numbers.length; j++) {
				if(numbers[i]% 2==0 && numbers[j] %2==0) {
				if (numbers[i] + numbers[j] == sum)
				{
					System.out.println("number "+numbers[i]+" number "+ numbers[j]+" = "+sum);
				}
				
			}
				}
		
		}
		return sum;
	}
}
