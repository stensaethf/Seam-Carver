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
		String direction = null;
		for (String arg: args) {
			if (arg.equals("--show")) {
				showImages = true;
			} else if (imageFilePath == null) {
				imageFilePath = arg;
			} else if (outputImageFilePath == null) {
				imageFilePath = arg;
			} else if (num == null) {
				num = Integer.parseInt(arg);
			} else if (direction == null) {
				direction = arg;
			}
		}

		if (imageFilePath == null && outputImageFilePath == null) {
            System.err.println("Usage: java ImageExample inputImage outputImage numOfSeams direction [--show]");
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
        	image = carveSeam(image, direction);

        	num--;
        }

        // More code
	}

	private static BufferedImage carveSeam(BufferedImage image, String direction) {
		// We need to:
		// computeEnergy
		// findSeam
		// removeSeam aka construct new image w/o the seam.

		BufferedImage newImage = null;
		int[][] energyTable = computeEnergy(image);
		int[][] seam = findSeam(energyTable, direction);
		newImage = removeSeam(image, seam, direction);

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

	private static int[][] findSeam(int[][] energyTable, String direction) {
		// Come back and complete this, after removeSeam --> more interesting...
		int[][] seam;
		if (direction.equals("vertical")) {
			// vertical seam.
			seam = new int[energyTable[0].length][2];

			// code
		} else {
			// horizontal seam.
			seam = new int[energyTable.length][2];

			// code
		}

		return seam;
	}

	private static BufferedImage removeSeam(BufferedImage image, int[][] seam, String direction) {
		BufferedImage newImage;
		int width = image.getWidth();
        int height = image.getHeight();
		if (direction.equals("vertical")) {
			// vertical seam.
			newImage = new BufferedImage(width - 1, height, BufferedImage.TYPE_INT_ARGB);
		} else {
			// horizontal seam.
			newImage = new BufferedImage(width, height - 1, BufferedImage.TYPE_INT_ARGB);
		}

		// Loops over ever pixel in the original image and copies them over.
		// Do not copy over the pixels in the seam.

		return newImage;
	}
}


