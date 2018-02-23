package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ToDoListTracker implements ActionListener {
	public static void main(String[] args) {
		ToDoListTracker start = new ToDoListTracker();

	}

	public void updateTask() {
		String tasklist = "";
		for (String task : list) {
			tasklist += task;
			tasklist += "\n";
		}
		showsList.setText(tasklist);
		frame.repaint();
	}

	ArrayList<String> list = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("add");
	JButton remove = new JButton("remove");
	JButton save = new JButton("save");
	JButton load = new JButton("load");
	JTextArea showsList = new JTextArea();

	String persons = "src/intro_to_file_io/";

	ToDoListTracker() {

		frame.setVisible(true);
		frame.setSize(500, 600);
		frame.add(panel);

		panel.add(add);
		add.addActionListener(this);

		panel.add(remove);
		remove.addActionListener(this);

		panel.add(save);
		save.addActionListener(this);

		panel.add(load);
		load.addActionListener(this);

		panel.add(showsList);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource().toString());
		if (e.getSource().equals(add)) {
			String user = JOptionPane.showInputDialog("Add a task");
			list.add(user);
			updateTask();
		}
		if (e.getSource().equals(remove)) {
			String request = JOptionPane.showInputDialog("What do you want to remove?");
			list.remove(request);
		}
		if (e.getSource().equals(save)) {
			String filename = JOptionPane.showInputDialog("Choose a file");

			try {
				FileWriter saves = new FileWriter(persons + filename + ".txt", true);
				for (String person : list) {
					saves.write(person + "\n");

				}
				saves.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource().equals(load)) {
			// JFileChooser jfc = new JFileChooser();
			// int returnVal = jfc.showOpenDialog(null);
			// if (returnVal == JFileChooser.APPROVE_OPTION) {
			// String fileName = jfc.getSelectedFile().getAbsolutePath();
			//
			list = new ArrayList<String>();
			System.out.println("load");
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/desktop.txt"));

				String line = br.readLine();
				System.out.println(line);
				while (line != null) {
					System.out.println(line);
					list.add(line);
					line = br.readLine();
				}

				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			updateTask();
		}
	}

}
