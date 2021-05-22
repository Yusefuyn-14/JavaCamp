import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Main {

	static JPanel panelliTextLabel(String labelText) {
		
		JPanel panel = new JPanel();
		panel.setSize(400,25);
		
		JLabel label = new JLabel();
		label.setSize(100,25);
		label.setLocation(0,0);
		label.setText(labelText);
		panel.add(label);
		
		JTextField text = new JTextField("Deneme");
		text.setSize(300,25);
		text.setLocation(100, 0);
		text.setText("Deneme");

		panel.add(text);
		

		return panel;
		
	}
	
	static JPanel panellipassTextLabel(String labelText) {
		
		JPanel panel = new JPanel();
		panel.setSize(400,25);
		
		JLabel label = new JLabel();
		label.setSize(100,25);
		label.setLocation(0,0);
		label.setText(labelText);
		panel.add(label);
		
		JPasswordField text = new JPasswordField("pass");
		text.setSize(300,25);
		text.setLocation(100, 0);
		text.setText("pass");
		panel.add(text);

		return panel;
		
	}
	
	static JPanel panelButton(String buttonText) {
		
		JPanel panel = new JPanel();
		panel.setSize(400,25);
		
		JButton button = new JButton(buttonText);
		button.setText(buttonText);
		button.setSize(400,25);
		button.setLocation(0,0);
		// button.setBackground(new Color(255,0,0));
		panel.add(button);

		return panel;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jframe = new JFrame("Test Pencere");

		jframe.setSize(400,125);
		jframe.setLocation((1366-400) / 2, (768-90)/2);
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
		jframe.setVisible(true);
		/*JButton button  = new JButton();
		button.setSize(300,100);
		button.setText("OK");
		button.setLocation(50,375);*/
		JPanel panel = panelliTextLabel("Kullanıcı :");
		jframe.add(panel);
		panel.setLocation(0,0);
		//panel.show(true);
		
		JPanel panel2 = panellipassTextLabel("Şifre :");
		jframe.add(panel2);
		panel2.setLocation(0,30);
		
		JPanel panel3 = panelButton("Giriş");
		jframe.add(panel3);
		panel3.setLocation(0,60);
				
		//panel2.show(true);
		//jframe.add(button);
		
	}

}
