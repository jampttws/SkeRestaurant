package javaApplication;

import java.io.InputStream;
import java.util.Scanner;

public class RestaurantManager {

	static final String MENU_FILE = "javaApplication/menu.txt";

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
