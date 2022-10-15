import controller.Game;
import controller.RandomNum;
import view.Input;

public class Main {
	public static void main(String[] args) {
		Input input = new Input();
		Game game = new Game();
		RandomNum rd = new RandomNum();

		game.playGame();

	}
}
