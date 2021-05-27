import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main1 {
    public static void main(String[] args) throws IOException {
        JFrame aFrame = new JFrame();
        aFrame.setSize(400,400);
        aFrame.setVisible(true);
        Container aContainer = aFrame.getContentPane();
        
        JLabel aJLabel =  new JLabel("Hello");
        
        aContainer.add(aJLabel);
        
        
        File file = new File("C:\\Users\\oFeasl\\Desktop\\TestImg.jpg");
        BufferedImage aBufferedImage = (BufferedImage)ImageIO.read(file);
//        aBufferedImage.set
        
        Image aImage = aBufferedImage;
        aJLabel.setIcon(new ImageIcon(aImage));
        
        System.out.println("Hello");

    }
}