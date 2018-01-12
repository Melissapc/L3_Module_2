package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Encryption {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Write a message");
		String output = "";
		for (int i = 0; i <= input.length() - 1; i++) {
			char letter = input.charAt(i);
			int number = (int) letter;
			number++;
			letter = (char) number;
			output += letter;
		}
		System.out.println(output);

		
			try

			{
				FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt");

				/*
				 * NOTE: To append to a file that already exists, add true as a second parameter
				 * when calling the FileWriter constructor. (e.g. FileWriter fw = new
				 * FileWriter("src/intro_to_file_io/test2.txt", true);)
				 */

				fw.write("\n" + output);

				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
