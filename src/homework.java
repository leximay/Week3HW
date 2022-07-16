import java.util.Arrays;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length - 1] - ages[0]);
		int[] ages1 = {3, 9, 23, 64, 2, 8, 28, 93, 80};
		System.out.println(ages1[ages1.length - 1] - ages1[0]);
		int answer = 0;
		for (int x : ages) {
			answer += x;
		}
		System.out.println(answer / ages.length);
		
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		int result = 0;
		for (String name : names) {
			int nameLength = name.length();
			result += nameLength;
		}
			System.out.println(result / names.length);
		
			String result1 = "";
			for (int i = 0; i < names.length; i++) {
				result1 = result1.concat(names[i]);
				if (i < names.length - 1) {
					result1 = result1.concat(" ");
				}
			}
			System.out.println(result1);
	
		System.out.println(names[names.length - 1]);
		System.out.println(names[0]);
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		int sum = 0;
		for (int nameLength1 : nameLengths) {
			sum += nameLength1;
		}
		System.out.println(sum);
		System.out.println(greet("Hello", 3));
		String firstName = "Lexi";
		String lastName = "Stephens";
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
		System.out.println(sumArray(ages));
		double[] doubleArray = {60.5, 12.9, 54.1, 76.7, 3.4};
		System.out.println(averageDouble(doubleArray));
		double[] doubleArray2 = {49.7, 9.4, 21.3, 67.7, 1.2};
		System.out.println(averageOf2Arrays(doubleArray, doubleArray2));
		boolean isHotOutside = true;
		double moneyInPocket = 15.75;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		greetings("Lexi");
		}
		
		public static String greet(String str, int num) {
			String result = "";
			for (int i = 0; i < num; i++) {
				result += str;
}
	return result; 
	
		}
		public static String createFullName(String x, String y) {
			String fullName = x + " " + y;
			return fullName;
		}
		public static boolean sumArray(int[] numbers) {
			int sum = 0;
			for (int number : numbers) {
				sum += number;
				if (sum > 100){
				}
			}
			return true;
	}
		public static double averageDouble(double[] doubles) {
			double result2 = 0;
			for (double double1 : doubles) {
				result2 += double1;
			}
			return result2 / doubles.length;
	} 

		public static boolean averageOf2Arrays(double[] doubles1, double[] doubles2) {
			double answer2 = 0;
				for (double double2 : doubles1) {
				answer2 += double2;
				double average = answer2 / doubles1.length;
			double answer3 = 0;
				for (double double3 : doubles2) {
					answer3 += double3;
					double average2 = answer3 / doubles2.length;
					if (average > average2) {
					}
				}
				}
				return true;
				
		}
		
		public static boolean willBuyDrink(boolean bool, double money) {
			if (bool = true && money > 10.50) {
}
		return true;
		} 
		public static void greetings(String name) {
			System.out.println("Hello " + name);
			// This method takes a name and returns a greeting. I created this because there are multiple names in 
			// an array above that the method could be used for 
		}
		}

		



		
			



		



		
	



	


