package academy.learnprogramming;

public class Main {

	public static void main(String[] args) {

		int result = 1 + 2; // 1 + 2 = 3
		System.out.println("1 + 2 = " + result);
		int previousResult = result;
		System.out.println("previousResult =  " + previousResult);
		result = result - 1; // 3 - 1 = 2
		System.out.println("3 - 1 = " + result);
		System.out.println("previousResult =  " + previousResult);

		result = result * 10; // 2 * 10 = 20
		System.out.println("2 * 10 = " + result);

		result = result / 5; // 20 / 5 = 4
		System.out.println("20 / 5 = " + result);

		result = result % 3; // the remainder of (4 % 3) = 1
		System.out.println("4 % 3 = " + result);

		// result = result +1;
		result++; // 1 +1 = 2
		System.out.println("1 + 1 = " + result);

		result--; // 2 - 1 = 1
		System.out.println("2 - 1 = " + result);

		// result = result +2
		result += 2; // 1 + 2 = 3
		System.out.println("1 + 2 = " + result);

		// result = result * 10
		result *= 10; // 3 * 10 = 30
		System.out.println("3 * 10 = " + result);

		// result = result / 3
		result /= 3; // 30 / 3 = 10
		System.out.println("30 / 3 = " + result);

		// result = result - 2
		result -= 2; // 10 - 2 = 8
		System.out.println("10 - 2 = " + result);

		boolean isAlien = false;
		if (isAlien == false) {
			System.out.println("It is not an alien, Allen!");
		}

		int topScore = 80;
		if (topScore < 100) {
			System.out.println("You have the top score!");
		}

		int secondTopScore = 81;
		if ((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("Greater than second top score and less than 100");
		}

		if ((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("Either or both of the conditions are true");
		}

		boolean isCar = true;
		if (isCar) {
			System.out.println("This checks if boolean is set to true, not if it exists");
		}
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("wasCar is true");
		}

//challenge
		double challengeDouble = 20.00;
		double challengeSecondDouble = 80.00;
		double challengeDoubleResult = (challengeDouble + challengeSecondDouble) * 100.00;
		double challengeRemainder = (challengeDoubleResult % 40.00);
		boolean challengeBool = (challengeRemainder == 0) ? true : false;
		System.out.println(challengeBool);

		if (!challengeBool) {
			System.out.println("Got some remainder");
		}
	}
}
