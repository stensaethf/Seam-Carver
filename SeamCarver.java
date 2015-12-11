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
		// do stuff
		int[][] energyTable = null;
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


