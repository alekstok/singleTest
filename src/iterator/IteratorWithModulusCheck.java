package iterator;

import java.util.HashMap;

public class IteratorWithModulusCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int maxNumberOfDigits = 100;
		HashMap<Integer, String> denominators = new HashMap<Integer, String>();
		denominators.put(3, "web");
		denominators.put(5, "crowd");

		for (int i = 1; i <= maxNumberOfDigits; i++) {

			String textToDisplay = "";

			for (int denominator : denominators.keySet()) {

				if (i % denominator == 0) {
					textToDisplay += denominators.get(denominator);
				}
			}

			if (textToDisplay == "") {
				textToDisplay = Integer.toString(i);
			}

			System.out.println(textToDisplay);
		}
	}
}
