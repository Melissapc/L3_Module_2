package intro_to_file_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Encryption {
	public static void main(String[] args) {

		Encryption user = new Encryption();

		String input = JOptionPane.showInputDialog("Write a message");
		String output = "";
	for (int i = 0; i <= input.length()-1; i++) {
     output+=input.charAt(i);
}
System.out.println(output);
				
		
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/user.txt", true);

			fw.write("\n " + input);

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
