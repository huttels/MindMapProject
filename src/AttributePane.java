import java.awt.*;
import javax.swing.*;

public class AttributePane extends JPanel{
//	JComponent attributePane; 이거 왜??
	
	public AttributePane() {
			//attributePane title
			JComponent attributePaneTitle = new JPanel();
			attributePaneTitle.add(new JLabel("AttributePane"));//�씪踰⑤쭚怨� �뵶嫄곗뾾�굹
			
			//attributePane value
			JComponent attributePaneValue = new JPanel();
			attributePaneValue.setLayout(new GridLayout(6,2,SimpleMindMap.height/100,SimpleMindMap.width/100));
				
				attributePaneValue.add(new JLabel("TEXT:"));
				JTextField text = new JTextField();
				attributePaneValue.add(text);//蹂�寃쎈텋媛��뒫�븯寃뚰빐�빞�븿
				
				attributePaneValue.add(new JLabel("X:"));
				JTextField x = new JTextField();
				attributePaneValue.add(x);
				
				attributePaneValue.add(new JLabel("Y:"));
				JTextField y = new JTextField();
				attributePaneValue.add(y);
				
				attributePaneValue.add(new JLabel("W:"));
				JTextField w = new JTextField();
				attributePaneValue.add(w);
				
				attributePaneValue.add(new JLabel("H:"));
				JTextField h = new JTextField();
				attributePaneValue.add(h);
				
				attributePaneValue.add(new JLabel("Color:"));
				JTextField color = new JTextField();
				attributePaneValue.add(color);
				
			//attributePane button
			JComponent attributePaneButton = new JPanel();
			JButton changeButton = new JButton("적용");
			attributePaneButton.add(changeButton);
			
			//attribuePane
			setLayout(new BorderLayout());
			add(attributePaneTitle,BorderLayout.NORTH);
			add(attributePaneValue,BorderLayout.CENTER);
			add(attributePaneButton,BorderLayout.SOUTH);
			//�솢 �깋�긽�씠 �븞蹂��븯�뒗吏�??
			attributePaneValue.setBackground(Color.PINK); 
			attributePaneTitle.setBackground(Color.ORANGE);
			attributePaneButton.setBackground(Color.ORANGE);
	}
			
}
