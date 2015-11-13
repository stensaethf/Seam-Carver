/**
 *  ImageExample.java
 *  Jeff Ondich, 28 October 2015
 *
 *  How to directly modify pixels in an image.
 */
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ImageExample {
    public static void main(String[] args) {
        // Parse command line
        boolean showImages = false;
        String imageFilePath = null;
        String outputImageFilePath = null;
        String outputFormatName = ""; // e.g. "png" or "jpg"
        for (String arg: args) {
            if (arg.equals("--show")) {
                showImages = true;
            } else if (imageFilePath == null) {
                imageFilePath = arg;
            } else if (outputImageFilePath == null) {
                outputImageFilePath = arg;
                int index = outputImageFilePath.lastIndexOf('.');
                if (index >= 0) {
                    outputFormatName = outputImageFilePath.substring(index + 1);
                }
            }
        }

        if (imageFilePath == null && outputImageFilePath == null) {
            System.err.println("Usage: java ImageExample inputImage outputImage [--show]");
            return;
        }

        // Open the input image
        BufferedImage image;
        try {
            image = ImageIO.read(new File(imageFilePath));
        } catch(IOException e) {
            System.err.println("Can't open " + imageFilePath);
            return;
        }

        // Get and save the grayscale image
        BufferedImage grayImage = toGray(image);
        try {
            File outputfile = new File(outputImageFilePath);
            ImageIO.write(grayImage, outputFormatName, outputfile);
        } catch (IOException e) {
            System.err.println("Trouble saving " + outputImageFilePath);
            return;
        }

        // Show the before and after images
        if (showImages) {
            showImage(image);
            showImage(grayImage);
        }
    }

    private static BufferedImage toGray(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int color = image.getRGB(x, y);
                int alpha = (color & 0xff000000) >> 24;
                int red = (color & 0x00ff0000) >> 16;
                int green = (color & 0x0000ff00) >> 8;
                int blue = (color & 0x000000ff);
                int gray = (red + green + blue) / 3;

                int newColor = (alpha << 24) | (gray << 16) | (gray << 8) | gray;
                newImage.setRGB(x, y, newColor);
            }
        }

        return newImage;
    }

    private static void showImage(BufferedImage image) {
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JLabel(new ImageIcon(image)));
        frame.pack();
        frame.setVisible(true);
    }
}


