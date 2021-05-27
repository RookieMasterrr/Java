import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main1 {
    public static void main(String[] args) throws IOException {
        JFrame aFrame = new JFrame();
        aFrame.setSize(400,400);
        aFrame.setVisible(true);
        File file = new File("C:\\Users\\oFeasl\\Desktop\\TestImg.jpg");
        BufferedImage aBufferedImage = (BufferedImage)ImageIO.read(file);
        Graphics aGraphics = aBufferedImage.getGraphics();
//        aGraphics.drawImage(aBufferedImage,400,400,aFrame);
        ImageIcon aIcon = new ImageIcon(aBufferedImage);
        
        aIcon.
//        Container aContainer = aFrame.getContentPane();
//        aContainer.add(aIcon);
        
        aFrame.add(aIcon);
        System.out.println("Hello");

    }
}