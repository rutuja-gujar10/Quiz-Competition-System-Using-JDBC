package QuizCompetition;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quiz Competition");
		System.out.println("Enter your choice:");
		System.out.println("1. Admin");
		System.out.println("2. User");
		System.out.println("3. Score");

		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			Admin.addQuestion();
			break;

		case 2:
			System.out.print("Enter your name: ");
			String name = sc.nextLine();
			Quiz.startQuiz(name);
			break;
		case 3:
			Quiz.viewScoreCard();
			break;

		default:
			System.out.println("Invalid choice!");

		}
	}
}
