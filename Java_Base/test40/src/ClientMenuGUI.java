import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import java.awt.Container;

public class ClientMenuGUI {
    public static JPanel aJPanel;
    public static Container aContainer;
    public static JLabel aJLabel;
    public ClientMenuGUI(){
        JFrame aFrame = new JFrame("ClientMenu");
        aContainer = aFrame.getContentPane();
        aJPanel = new JPanel();
        


        aJLabel = new JLabel();
        aJLabel.setPreferredSize(new DimensionUIResource(130, 50));
        aJPanel.add(new JLabel());
        aJPanel.add(new JLabel());
        aJPanel.add(aJLabel);
        aJPanel.add(new JLabel());


        aContainer.add(aJPanel);
        
        aFrame.setVisible(true);
        aFrame.setSize(400,400);
        aFrame.setAlwaysOnTop(true);
        aFrame.setDefaultCloseOperation(3);
        // aJPanel.add(new JButton("Hello"));
        // aJPanel.add(new JButton("Hello"));
        
        // aContainer.add(aJPanel);
    }
    public static void main(String[] args) {
        new ServerMenuGUI();
    }
    public static void SomeoneConnect(String text){
        aJPanel.add(new JButton(text));
        aContainer.add(aJPanel);
    }
}