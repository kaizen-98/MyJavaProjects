package randomTopic;

import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		boolean i = true;
		while(i) {
			System.out.println("Please inter your marks");
			System.out.println("Math Marks?");
			int math = kb.nextInt();
			System.out.println("Arabic Marks?");
			int arabic = kb.nextInt();
			
			System.out.println("Do you want enter more marks?");
			String key = kb.next();
			
			if(key.equals("yes")) {
				
			}else {
				for(int j =0; j<5; j++) {
					stack.add(math);
					stack.add(arabic);
					
				}
				i = false;
			}
			
					
		}
		   for(int j = 0; j < 5; j++)
	        {
	            Integer y = (Integer) stack.pop();
	            System.out.println(y);
	        }
	}

}
