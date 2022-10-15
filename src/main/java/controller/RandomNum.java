package controller;

import java.util.ArrayList;

public class RandomNum {
	private int length = 3;

	private int end = 9;
	private ArrayList<Integer> numList = new ArrayList<>();

	public RandomNum() {
		setRandomNum();
	}

	public void setRandomNum() {
		int cnt = 0;

		while (cnt < length) {
			int number = (int)(Math.random() * end) + 1;

			if (!numList.contains(number)) {
				numList.add(number);
				cnt++;
			}
		}
	}

	public ArrayList<Integer> getRandomNum() {
		return this.numList;
	}
}
