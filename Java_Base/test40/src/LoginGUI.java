import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.GridLayout;

public class LoginGUI {
    JTextField usernameTextField;
    JPasswordField passwordField;
    public LoginGUI(){
        JFrame aFrame = new JFrame("Login");
        Container aContainer = aFrame.getContentPane();
        aContainer.setLayout(new GridLayout(3,4));




        
        aFrame.setSize(700,300);
        aFrame.setDefaultCloseOperation(3);
        aFrame.setVisible(true);
    }
}
