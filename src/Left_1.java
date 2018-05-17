import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setBackground(Color.yellow);
	}
}


public class Left_1 extends JPanel{
	public Left_1() {
		
		setLayout(new BorderLayout());
		JComponent TextEditorPane = new JPanel();
		TextEditorPane.add(new JLabel("Text Editor Pane"));
		JTextArea Text = new JTextArea(20,10);
		JButton applyButton = new JButton("Àû¿ë");
		add(TextEditorPane,BorderLayout.NORTH);
		add(new JScrollPane(Text),BorderLayout.CENTER);
		add(applyButton,BorderLayout.SOUTH);
		setPreferredSize(new Dimension(500,1000));
		
		Text.setBackground(Color.PINK);
		TextEditorPane.setBackground(Color.ORANGE);
		applyButton.setBackground(Color.ORANGE);
		applyButton.addActionListener(new MyActionListener());
		setVisible(true);
		setSize(SimpleMindMap.width,SimpleMindMap.height);
		
	}

}
