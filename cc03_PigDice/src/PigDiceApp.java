public class PigDiceApp {

	public static void main(String[] args) {
		int games = Console2.getInt("Number of games to play? ");
		int idx = 0;
		int score = 0;
		int highScore = 0;
		while (idx < games) {
			score = pigDice();
			idx++;
			if (score > highScore) {
				highScore = score;
			}
		System.out.println("Score for game " + idx + ": " + score);
		}
		System.out.println("High score: " + highScore);
	}

	private static int pigDice() {
		int dice = 0;
		int score = 0;
		while (dice != 1) {
			dice = (int) (Math.random() * 6 + 1);
			if (dice != 1) {
				score = score + dice;
			}
		}
		return score;
	}

}
