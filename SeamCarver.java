/**
 * SeamCarver.java
 * Frederik Roenn Stensaeth
 * Date: 12.09.15
 *
 * Java program to perform content-aware image resizing using seam carving.
 **/

import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * SeamCarver() xx
 *
 * @param xx
 * @return xx
 */
public class SeamCarver {
	public static void main(String[] args) {
		boolean showImages = false;
		String imageFilePath = null;
		String outputImageFilePath = null;
		Integer num  = null;
		for (String arg: args) {
			if (arg.equals("--show")) {
				showImages = true;
			} else if (imageFilePath == null) {
				imageFilePath = arg;
			} else if (outputImageFilePath == null) {
				imageFilePath = arg;
			} else if (num == null) {
				num = Integer.parseInt(arg);
			}
		}

		if (imageFilePath == null && outputImageFilePath == null) {
            System.err.println("Usage: java ImageExample inputImage outputImage numOfSeams [--show]");
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

        // Get the new image w/o one seam.
        while (num > 0) {
        	image = carveSeam(image);

        	num--;
        }

        // More code
	}

	private static BufferedImage carveSeam(BufferedImage image) {
		// We need to:
		// computeEnergy
		// findSeam
		// removeSeam aka construct new image w/o the seam.

		BufferedImage newImage = null;
		int[][] energyTable = computeEnergy(image);
		int[][] seam = findSeam(image, energyTable);
		newImage = removeSeam(image, seam);

		return newImage;
	}

	private static int[][] computeEnergy(BufferedImage image) {
		int width = image.getWidth();
        int height = image.getHeight();
		int[][] energyTable = new int[width][height];

		// Loop over every pixel in the image and compute its energy.
		for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int color = image.getRGB(x, y);
                int alpha = (color & 0xff000000) >> 24;
                int red = (color & 0x00ff0000) >> 16;
                int green = (color & 0x0000ff00) >> 8;
                int blue = (color & 0x000000ff);
                int gray = (red + green + blue) / 3;

                // compute the energy and store it in the table.
                energyTable[x][y] = gray; // redo this later with the actual method.
            }
        }

		return energyTable;
	}

	private static int[][] findSeam(BufferedImage image, int[][] energyTable) {
		// do stuff
		int[][] seam = null;
		return seam;
	}

	private static BufferedImage removeSeam(BufferedImage image, int[][] seam) {
		// do stuff
		BufferedImage newImage = null;
		return newImage;
	}
}


