
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.io.IOException;
public class myGUIC {
    static String whatinText = "Test";
    public static void init() throws IOException {
        Client clientSide = new Client("localhost", 5050);

        JFrame aFrame = new JFrame("Client");
        Container aContainer = aFrame.getContentPane();
        aContainer.setLayout(new FlowLayout());
        JPanel aJPanel = new JPanel(); 

        JTextField aField = new JTextField();
        aField.setPreferredSize(new DimensionUIResource(100, 100));
        aField.setText("you can edit here");
        aJPanel.add(aField);

        JTextField bField = new JTextField();
        bField.setPreferredSize(new DimensionUIResource(100, 100));
        aJPanel.add(bField);

        JButton aButton = new JButton("aButton");
        aButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                whatinText = aField.getText();
                try {
                    clientSide.Write(myGUIC.whatinText);
                } catch (IOException e1) {
                }

            }
        });
        aJPanel.add(aButton);

        aContainer.add(aJPanel);

        aFrame.setSize(300,300);
        aFrame.setDefaultCloseOperation(3);
        aFrame.setVisible(true);
    }
    // public static void main(String[] args) {
    //     myGUI.init();
    // }
}   
