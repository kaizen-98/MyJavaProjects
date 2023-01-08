package randomTopic;

public class Djx {

	public static void main(String[] args) {
		
		String[] names = {"Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "atyab", "Abdullah", "Abdullah"};

		for(int i =0; i<names.length; i++) {
			System.out.println(" Name!"+i+":"+names[i]);
		}
		

		 for(int i=0; i<names.length; i++) {
			 int count = 1;
			for(int j = i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					count++;
				}
			}
			  if (count > 1) {
			        System.out.println("Name '" + names[i] + "' occurs " + count + " times.");
			      }
		 }
	}

}
