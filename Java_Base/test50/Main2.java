import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
public class Main2 {
    public static void main(String[] args) throws IOException {
        File aFile = new File("red.png");
        BufferedImage img = ImageIO.read(aFile);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        ImageIO.write(img, "png", stream);

        byte a[] = stream.toByteArray();
        System.out.println(a.length);


        byte c[] = new byte[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        // for (int i = 0; i < a.length; i++) {
        //     // c[i]=c[i];
        //     // System.out.println(c[i]);
        // }

        // System.out.println(c[500]);
        c[500]=122;



        ByteArrayInputStream arrayInputStream2 = new ByteArrayInputStream(c);
        BufferedImage img3 = ImageIO.read(arrayInputStream2);
        ImageIO.write(img3, "png", new File("cTestImage.png"));

    }
}
