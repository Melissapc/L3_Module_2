package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class EncryptedtoDecrypted {
	public static void main(String[] args) {
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String fileName = jfc.getSelectedFile().getAbsolutePath();
			System.out.println(fileName);

			String decrypted = "";

			// reads file
			String line = "";
			try {
				BufferedReader br = new BufferedReader(new FileReader(fileName));

				line = br.readLine();
				
					System.out.println(line);
				
				

				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (int i = 0; i <= line.length() - 1; i++) {
				char letter = line.charAt(i);
				int number = (int) letter;
				number--;
				letter = (char) number;
				decrypted += letter;

			}
			System.out.println(decrypted);
		}
	}
}