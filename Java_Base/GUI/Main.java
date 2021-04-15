// 窗体 JFrame JDialog
// 容器 Container
// 面板 Panel 
// 
package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import java.awt.Container;
import java.awt.BorderLayout;
// import java.awt.Jbut
// import jdk.internal.platform.Container;

public class Main{
    public static void main(String[] args) {
        JFrame aFrame = new JFrame("Hello");
        
        Container aContainer = aFrame.getContentPane();
        aContainer.setLayout(new BorderLayout());
        
        JPanel aJPanel = new JPanel();
        JPanel bJPanel = new JPanel();
        
        JButton aButton = new JButton("But");
        aButton.setPreferredSize(new DimensionUIResource(70, 70));
        aButton.setSize(1,1);

        JLabel aJLabel = new JLabel("Lab");

        aJPanel.add(aButton);
        bJPanel.add(aJLabel);

        aContainer.add(aJPanel,BorderLayout.SOUTH);
        aContainer.add(bJPanel,BorderLayout.WEST);
        
        aFrame.setSize(300,300);
        aFrame.setDefaultCloseOperation(3);
        aFrame.setAlwaysOnTop(true);
        aFrame.setVisible(true);
    }
}
