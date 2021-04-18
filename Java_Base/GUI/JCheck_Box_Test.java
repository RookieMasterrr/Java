// 窗体 JFrame JDialog
// 容器 Container
// 面板 Panel 
// 
package GUI;

import javax.swing.JButton;
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

        JButton aButton = new JButton("But");
        aButton.setPreferredSize(new DimensionUIResource(70, 70)); 
        
        aButton.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tButton = (JButton)e.getSource();
                // if(e.getModifiers()-16==0){
                //     System.out.println("NOTHING");
                // }else if(e.getModifiers()-16==1){
                //     System.out.println("SHIFT");
                // }else if(e.getModifiers()-16==2){
                //     System.out.println("CTRL");
                // }else if(e.getModifiers()-16==8){
                //     System.out.println("ALT");
                // }
                System.out.println(e.getClass());
                System.out.println(e.getActionCommand());
            }
        });
        aButton.setEnabled(true);

        aJPanel.add(aButton);

        aContainer.add(aJPanel,BorderLayout.SOUTH);
        
        aFrame.setSize(300,300);
        aFrame.setDefaultCloseOperation(3);
        aFrame.setAlwaysOnTop(true);
        aFrame.setVisible(true);
    }
}
