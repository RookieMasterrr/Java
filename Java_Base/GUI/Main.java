// 窗体 JFrame JDialog
// 容器 Container
// 面板 Panel 
// 
package GUI;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class Main{
    public static void main(String[] args) {
        JFrame aFrame = new JFrame("Hello");
        
        Container aContainer = aFrame.getContentPane();
        aContainer.setLayout(new BorderLayout());
        
        JPanel aJPanel = new JPanel();

        JPanel bJPanel = new JPanel();

        JPanel cJPanel = new JPanel();


        JButton aButton = new JButton("But");

        JLabel aJLabel = new JLabel("Lab");

        JCheckBox aBox = new JCheckBox("Check");

        aJPanel.add(aButton);
        bJPanel.add(aJLabel);
        cJPanel.add(aBox);

        aContainer.add(aJPanel,BorderLayout.SOUTH);
        aContainer.add(bJPanel,BorderLayout.WEST);
        aContainer.add(cJPanel,BorderLayout.EAST);
        
        aFrame.setSize(300,300);
        aFrame.setDefaultCloseOperation(3);
        aFrame.setAlwaysOnTop(true);
        aFrame.setVisible(true);
    }
}