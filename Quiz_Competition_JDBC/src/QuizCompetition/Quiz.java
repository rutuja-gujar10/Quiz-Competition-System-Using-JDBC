package QuizCompetition;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Quiz {
	public static void startQuiz(String username) {
		int score = 0;

		try (Connection con = DBConnection.getConnection()) {
			String sql = "SELECT * FROM question ORDER BY RAND() LIMIT 5";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			Scanner sc = new Scanner(System.in);

			while (rs.next()) {
				System.out.println("\n" + rs.getString("question"));
				System.out.println("1. " + rs.getString("option1"));
				System.out.println("2. " + rs.getString("option2"));
				System.out.println("3. " + rs.getString("option3"));
				System.out.println("4. " + rs.getString("option4"));
				System.out.print("Your Answer: ");

				int ans = sc.nextInt();
				if (ans == rs.getInt("correct_option")) {
					score++;
				}
			}

			PreparedStatement ps = con.prepareStatement("INSERT INTO result(username, score) VALUES (?, ?)");
			ps.setString(1, username);
			ps.setInt(2, score);
			ps.executeUpdate();

			System.out.println("\nFinal Score: " + score + "/5");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void viewScoreCard() {

		try (Connection con = DBConnection.getConnection()) {

			String sql = "SELECT username, score FROM result ORDER BY score DESC";

			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			System.out.println("\n===== SCORE CARD =====");
			System.out.printf("%-15s %-5s%n", "Username", "Score");
			System.out.println("----------------------");

			while (rs.next()) {
				System.out.printf("%-15s %-5d%n", rs.getString("username"), rs.getInt("score"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
