package intro_to_file_io;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class EncryptedtoDecrypted {
	public static void main(String[] args) {
JFileChooser jfc = new JFileChooser();
			int returnVal = jfc.showOpenDialog(null);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				String fileName = jfc.getSelectedFile().getAbsolutePath();
				System.out.println(fileName);
		String encrypted = JOptionPane.showInputDialog("Choose A FILE?");
		String decrypted = "";

		for (int i = 0; i <= encrypted.length() - 1; i++) {
			char letter = encrypted.charAt(i);

			
			
			
			}
		}
	}
}
