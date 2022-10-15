import java.util.ArrayList;

import controller.RandomNum;
import view.Input;

public class Main {
	public static void main(String[] args) {
		Input input = new Input();
		RandomNum rd = new RandomNum();
		ArrayList<Integer> s = rd.getRandomNum();
		System.out.println(s.get(0));
		System.out.println(s.get(1));
		System.out.println(s.get(2));

	}
}
