// 窗体 JFrame JDialog
// 容器 Container
// 面板 Panel 
// 
package GUI;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class JButton_Test{
    public static void main(String[] args) {
        JFrame aFrame = new JFrame("Hello");
        
        Container aContainer = aFrame.getContentPane();
        aContainer.setLayout(new BorderLayout());
        
        JPanel aJPanel = new JPanel();

        JCheckBox aBox = new JCheckBox();
        
        aJPanel.add(aBox);

        aContainer.add(aJPanel,BorderLayout.SOUTH);
        
        aFrame.setSize(300,300);
        aFrame.setDefaultCloseOperation(3);
        aFrame.setAlwaysOnTop(true);
        aFrame.setVisible(true);
    }
}
