package controller;

import java.util.ArrayList;

import model.Player;
import view.Input;
import view.Output;
import view.ReGame;

public class Game {
	static Input input = new Input();
	static Output output = new Output();
	static ReGame regame = new ReGame();

	public void playGame() {
		RandomNum random = new RandomNum();
		printArr(random);

		if (!oneGame(random)) {
			return;
		}

		if (regame.inputNum() && regame.num.equals("1")) {
			playGame();
		}
	}

	public void printArr(RandomNum random) {
		ArrayList<String> a = random.getRandomNum();
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i));
		}
		System.out.println("");
	}

	boolean oneGame(RandomNum random) {
		Player player = new Player();

		if (input.inputNum()) {
			player.setNumber(input.num);
			gameResult(player, random);
			output.printResult(player);

			if (player.getStrike() != 3) {
				oneGame(random);
			}
		}
		return false;
	}

	void gameResult(Player player, RandomNum random) {
		String[] playerNumArr = player.getNumber().split("");
		ArrayList<String> randomNumArr = random.getRandomNum();

		for (int i = 0; i < 3; i++) {
			setStrikeOrBall(player, i, playerNumArr, randomNumArr);
		}
	}

	void setStrikeOrBall(Player player, int index, String[] playerNumArr, ArrayList<String> randomNumArr) {
		if (playerNumArr[index].equals(randomNumArr.get(index))) {
			player.setStrike(player.getStrike() + 1);
		} else if (randomNumArr.contains(playerNumArr[index])) {
			player.setBall(player.getBall() + 1);
		}
	}
}
