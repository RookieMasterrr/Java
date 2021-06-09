/**
 * Main1
 */
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Main1 {

    public static void main(String[] args) throws IOException {
        File aFile = new File("aTestImage.png");
        BufferedImage img = ImageIO.read(aFile);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        ImageIO.write(img, "png", stream);

        byte a[] = stream.toByteArray();
        System.out.println(a.length);


        File bFile = new File("bTestImage.png");
        BufferedImage bimg = ImageIO.read(bFile);
        ByteArrayOutputStream bstream = new ByteArrayOutputStream();
        ImageIO.write(bimg, "png", bstream);

        byte b[] = bstream.toByteArray();
        System.out.println(b.length);




        byte c[] = new byte[187257];

        for (int i = 0; i < 50000; i++) {
            c[i] = a[i];
        }
        for (int i = 50000; i < 187257; i++) {
            c[i] = b[i];
        }

        System.out.println(c.length);

        ByteArrayInputStream arrayInputStream2 = new ByteArrayInputStream(c);
        BufferedImage img3 = ImageIO.read(arrayInputStream2);
        ImageIO.write(img3, "png", new File("cTestImage.png"));

    }
}