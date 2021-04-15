package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class J_LabelFrame extends JFrame{
    private static final long serialVersionUID = -1044464425127674278L;
    // public J_LabelFrame(){
    //     super("框架和标签例程");
    // }        

    public static void main(String[] args) {
        J_LabelFrame aFrame = new J_LabelFrame();
        JLabel aJLabel = new JLabel("123");
        aFrame.add(aJLabel);
        // aFrame.add
        


        aFrame.setVisible(true);
        aFrame.setAlwaysOnTop(true);
        aFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        aFrame.setSize(360,150);        
    }
}
