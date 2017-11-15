

import java.io.InputStream;
import java.util.Scanner;

/**
 * The RestaurantManager class.
 * It can read file and return to String.
 * 
 *
 * @author Tanasorn Tritawisup
 */

public class RestaurantManager {

	static final String MENU_FILE = "data/menu.txt";

	public static String readFile() {
		ClassLoader loader = RestaurantManager.class.getClassLoader();
		InputStream in = loader.getResourceAsStream(MENU_FILE);

		Scanner scan = new Scanner(in);

		String menu = "";
		while (scan.hasNextLine()) {
			menu += scan.nextLine() + "\n";
		}
		return menu;
	}
}
