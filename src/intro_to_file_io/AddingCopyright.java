package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AddingCopyright {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("src/intro_to_file_io/AddingCopyright.java");
		names.add("src/intro_to_file_io/EncryptedtoDecrypted.java");
		names.add("src/intro_to_file_io/Encryption.java");

		for (String filename : names) {

			try {
				FileWriter fw = new FileWriter(filename, true);
				fw.write("//Copyright © 2018 by Melissa Perez");
				fw.close();

			} catch (IOException e) {
				// catches errors
			}

		}
	}
}
//Copyright © 2018 by Melissa Perez