package begineer.test;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;


public class GreyScaleConverter {
    public static void main(String[] args) {
        BufferedImage br = null;
        try{
            File file = new File("/Users/sauravjaiswal/Downloads/A-photos/IMG_1628.jpg");
            br = ImageIO.read(file);
            System.out.println(br == null);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int width = br.getWidth();
        int height = br.getHeight();

        int[] pixel = br.getRGB(0,0,width, height, null, 0, width);

        for (int i = 0; i < pixel.length; i++){
            int p = pixel[i];

            int a = (p >> 24) & 0xff;
            int r = (p >> 16) & 0xff;
            int g = (p >> 8) & 0xff;
            int b = p & 0xff;

            // calculate average
            int avg = (r + g + b) / 3;

            // replace RGB value with avg
            p = (a << 24) | (avg << 16) | (avg << 8) | avg;

            pixel[i] = p;
        }
        br.setRGB(0, 0, width, height, pixel, 0, width);
        // write image
        try {
            File f = new File(
                    "/Users/sauravjaiswal/Downloads/A-photos/saurav-x.png");
            ImageIO.write(br, "png", f);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
