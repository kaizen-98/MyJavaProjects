package ShopingSystem;

import java.util.Stack;

public class MyShop {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int [] RiceStock = {900,1200,1210,900,750,1050};
		int [] WheatStock = {1100,1900,1500,1800,1700,1100};
		int [] CottonStock = {200,700,300,290,600,750,350};
		int  BigestNumber =  RiceStock[0];
		int LgrestNumber =  WheatStock[0];
		int KaberNumber = CottonStock[0];
		for (int i =0; i<5; i++) {
			int comper = RiceStock[i] - RiceStock[i+1];
			RiceStock[i] = comper;
		}
		
		for (int i =0; i<5; i++) {
			System.out.println(RiceStock[i]);
			if(RiceStock[i]< BigestNumber) {
				 BigestNumber = RiceStock[i];
			}
		}
		for (int j =0; j<5; j++) {
			int comper2 = WheatStock[j] - WheatStock[j+1];
			WheatStock[j] = comper2;
		}
		
		for (int j =0; j<5; j++) {
			System.out.println(WheatStock[j]);
			if(WheatStock[j]< LgrestNumber) {
				LgrestNumber = WheatStock[j];
			}
		}
		
		for (int k =0; k<5; k++) {
			int comper3 =CottonStock[k] - CottonStock[k+1];
			CottonStock[k] = comper3;
		}
		
		for (int k =0; k<5; k++) {
			System.out.println(CottonStock[k]);
			if(CottonStock[k]< KaberNumber) {
				KaberNumber = CottonStock[k];
			}
		}
		 System.out.println("the largest profit RiceStock "+BigestNumber);
		 stack.push(BigestNumber);
		 System.out.println("the largest profit WheatStock "+LgrestNumber);
		 stack.push(LgrestNumber);
		 System.out.println("the largest profit CottonStock "+KaberNumber);
		 stack.push(KaberNumber);
		 
		 
		   while (!stack.isEmpty()) {
	            System.out.println(stack.pop());
	        }
	}

}
