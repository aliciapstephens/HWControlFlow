public class ControlFlowQs {
	
	public static void main(String[] args) {
	controlFlow();
	}
	
	public static void ControlFlow() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello World!");
		
		System.out.println("What is your name? (first name only)");
		String name = scanner.next();
		System.out.println("Hello, " + name + "!");
		
		System.out.println("Would you like to get lottery numbers? (Type Yes or No)");
		String getStarted = scanner.next();
		if (getStarted.equals("Yes") || getStarted.equals("yes")){
			
		System.out.println("What is the name of your favorite pet?");
		String petName = scanner.next();
		
		System.out.println("What is the age of your favorite pet? (use only numerical digits)");
		int petAge = scanner.nextInt();
		
		System.out.println("What is your lucky number? (use only numerical digits)");
		int luckyNum = scanner.nextInt();
		
		System.out.println("What is the jersey number of your favorite athlete? (Enter 10 if you do not have a favorite athlete)");
		int jerseyNum = scanner.nextInt();
		
		System.out.println("What year is your car? (Enter the last two digits of the year like 98)");
		int carYear = scanner.nextInt();
		
		System.out.println("Who is your favorite actor or actress?");
		String faveAct = scanner.next();
		
		System.out.println("Enter a random number between 1 and 50.");
		int randomNum = scanner.nextInt();
		
		
		System.out.println("Please, review your answers below.");
		System.out.println("Name: " + name);
		System.out.println("Favorite Pet: " + petName);
		System.out.println("Pet age: " + petAge);
		System.out.println("Lucky Number: " + luckyNum);
		System.out.println("Favorite Athlete Jersey Number: " + jerseyNum);
		System.out.println("Car Year: " + carYear);
		System.out.println("Favorite Actor/Actress: " + faveAct);
		System.out.println("Random Number: " + randomNum);
		
		System.out.println("Are your answers correct? Yes or No (If no, you can may start over)");
		String getGoing = scanner.next();
		if (getGoing.equals("Yes") || getGoing.equals("yes")) {
		System.out.println("Great! Here are your lottery numbers.");
		
		Random rand = new Random();
		
		int upperbound = 10;
		int int_random = rand.nextInt(upperbound);
		
		int magicBall = jerseyNum * randomNum - int_random;
		if (magicBall > 75) {
			magicBall = magicBall - 75;
		}
		
		int magicOne = carYear + petAge;
		if (magicOne > 75) {
			magicOne = magicOne - 75;
		}
		
		int nonMagic2 = luckyNum + int_random;
		if (nonMagic2 > 75) {
			nonMagic2 = nonMagic2 - 75;
		}
		
		int nonMagic3 = petAge + faveAct.length();
		
		int nonMagic4 = (Math.max(luckyNum, randomNum)) + int_random;
		
		int nonMagic5 = petName.codePointAt(0);
		if (nonMagic5 > 75) {
			nonMagic5 = nonMagic5 - 47;
		}
		
		System.out.println("Lottery numbers: " + magicOne + ", " + nonMagic2 + ", " + nonMagic3 + ", " + nonMagic4 + ", " + nonMagic5 + ", " + "Magicball: " + magicBall);
		
		System.out.println("Would you like to play again?");
		String playAgain = scanner.next();
		if (playAgain.equals("Yes") || playAgain.equals("yes")){
		controlFlow();
		} else {
			System.out.println("Thank you for participating!");
			System.exit(0);
		}
		}
		} else {
			System.out.println("Please, return later to generate lottery numbers.");
		}
		}
		}