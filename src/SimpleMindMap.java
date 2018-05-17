
import java.awt.*;
import javax.swing.*;

public class SimpleMindMap extends JFrame{
	final static int width = 1200;
	final static int height = 1000;
	
	public SimpleMindMap() {
		setTitle("MindMap");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		
		
		
		//contentPane.add(attributePane);
		JSplitPane pane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		JSplitPane pane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		
		
		//test code - the place for other JSplitPane (pane2)
		JComponent testPane = new JPanel();
		JPanel leftpanel = new Left_1();
		JComponent testPane2 = new JPanel();
		testPane2.add(new JButton("testButton2"));
		pane2.add(leftpanel);
		pane2.add(testPane2);
		pane1.add(pane2);
		
		//add attributePane on right side
		AttributePane attributePane = new AttributePane();
		pane1.add(attributePane);
		
		
		
		contentPane.add(pane1);
		setSize(width, height);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SimpleMindMap();

	}

}
