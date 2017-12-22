package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class ReadingFiles {
public static void main(String[] args) {
	
	ReadingFiles user= new ReadingFiles();
	
	String input= JOptionPane.showInputDialog("Write a message");
	try {
		FileWriter fw = new FileWriter("src/intro_to_file_io/user.txt");
		
	
		
		fw.write("\n " + input);
			
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
