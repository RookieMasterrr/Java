
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.plaf.DimensionUIResource;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import java.awt.Container;
import java.awt.event.ActionListener;
public class myGUI {
    static JFrame aFrame;
    static Container aContainer;
    static JPanel aJPanel;
    static JTextArea EditArea;
    static JTextArea RecArea;
    static JButton aButton;
    public myGUI(){
        aFrame = new JFrame("aFrame");
        aContainer = aFrame.getContentPane();
        aContainer.setLayout(new FlowLayout());
        aJPanel = new JPanel(); 

        aJPanel.add(new JLabel("RecText"));

        RecArea = new JTextArea();
        RecArea.setPreferredSize(new DimensionUIResource(200, 100));
        aJPanel.add(RecArea);

        aJPanel.add(new JLabel("EditText"));

        EditArea = new JTextArea();
        EditArea.setPreferredSize(new DimensionUIResource(200, 100));
        aJPanel.add(EditArea);

        aButton = new JButton("aButton");
        aButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(EditArea.getText());
                RecInfo(EditArea.getText());
            }
        });        
        aJPanel.add(aButton);

        aContainer.add(aJPanel);
        aFrame.setSize(700,300);
        aFrame.setDefaultCloseOperation(3);
        aFrame.setVisible(true);
    }

    public static void RecInfo(String Info){
        RecArea.setText(RecArea.getText()+"\n"+Info);
    }
    public static void main(String[] args) {
        new myGUI();
    }
}   
