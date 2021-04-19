
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import java.awt.Container;
import java.awt.event.ActionListener;
public class myGUIS {
    static String whatinText;
    static JTextField bField;
    public static void init() {
        JFrame aFrame = new JFrame("Server");
        Container aContainer = aFrame.getContentPane();
        aContainer.setLayout(new FlowLayout());
        JPanel aJPanel = new JPanel(); 

        JTextField aField = new JTextField();
        aField.setPreferredSize(new DimensionUIResource(100, 100));
        aField.setText("Nothing");
        aJPanel.add(aField);

        bField = new JTextField();
        bField.setPreferredSize(new DimensionUIResource(100, 100));
        aJPanel.add(bField);

        JButton aButton = new JButton("aButton");
        aButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                whatinText = aField.getText();
            }
        });
        aJPanel.add(aButton);

        aContainer.add(aJPanel);

        aFrame.setSize(300,300);
        aFrame.setDefaultCloseOperation(3);
        aFrame.setVisible(true);
    }
    public static void display(String aString){
        bField.setText(aString);
    }
    // public static void main(String[] args) {
    //     myGUI.init();
    // }
}   
