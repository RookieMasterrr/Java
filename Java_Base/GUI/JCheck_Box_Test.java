// 窗体 JFrame JDialog
// 容器 Container
// 面板 Panel 
// 
// package GUI;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;


public class JCheck_Box_Test{
    public static void main(String[] args) {
        JFrame aFrame = new JFrame("Hello");
        
        Container aContainer = aFrame.getContentPane();
        aContainer.setLayout(new BorderLayout());
        
        JPanel aJPanel = new JPanel();

        JCheckBox aBox = new JCheckBox("CheckBox1");
        
        myListener aListener = new myListener();

        aBox.addItemListener(aListener);

        aJPanel.add(aBox);

        aContainer.add(aJPanel,BorderLayout.SOUTH);
        
        aFrame.setSize(300,300);
        aFrame.setDefaultCloseOperation(3);
        aFrame.setAlwaysOnTop(true);
        aFrame.setVisible(true);
    }
}

class myListener implements ItemListener{

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("ddd");
        System.out.println(e.getStateChange());
        System.out.println(e.paramString());
        if(e.getStateChange()==2){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }
    }

}