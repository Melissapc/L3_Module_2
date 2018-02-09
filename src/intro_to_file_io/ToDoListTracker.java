package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoListTracker implements ActionListener {
	public static void main(String[] args) {

	}

	ArrayList<String> list = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("add");
	JButton remove = new JButton("remove");
	JButton save = new JButton("save");
	JButton load = new JButton("load");

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

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(add)) {
			String user = JOptionPane.showInputDialog("Add a task");
			list.add(user);
		}
		if (e.getSource().equals(remove)) {
			String request = JOptionPane.showInputDialog("What do you want to remove?");

		}
		if(e.getSource().equals(save)) {
			
		}
	}
}
