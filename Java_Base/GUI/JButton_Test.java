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
        aButton.setPreferredSize(new DimensionUIResource(70, 70)); //一个设置按键大小的方法
        
        aButton.addActionListener(new ActionListener(){ // 使用匿名类实现接口
            @Override
            public void actionPerformed(ActionEvent e){
                JButton tempButton =  (JButton)e.getSource();
                tempButton.setText("寄!");
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

class bt1_action implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);        
    }
    
}