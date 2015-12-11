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
	// values:
	// 	seam number
	// 	file name

	// methods:
	// 	findSeam (finds the min seam)
	// 	carve (carves out the seams)
	// 	removeSeam (removes a seam)
	// 	showNew (opens the new image)
	// 	showSeams (opens the original image with the removed seams highlighted)
	// 	getNum/setNum (gets and sets the seam number ~ for updating purposes)

	/**
	 * SeamCarver() xx
	 *
	 * @param xx
	 * @return xx
	 */
	// public SeamCarver(String filename, Integer seamNumber, String direction) {
	// 	// Open the input image
	// 	this.direction = direction;
 //        try {
 //            BufferedImage image = ImageIO.read(new File(filename));
 //        } catch(IOException e) {
 //            System.err.println("Can't open " + filename);
 //            return;
 //        }

 //        if (seamNumber < 1) {
 //        	System.err.println("Can't open " + filename);
 //            return;
 //        } else {
 //        	this.seamNumber = seamNumber;
 //        }

	// 	this.carve();
	// }

	// private void setDirection(String direction) {
	// 	this.direction = direction;
	// }

	// private String getDirection() {
	// 	return this.direction;
	// }

	// /**
	//  * setImate() sets the image of the SeamCarver object.
	//  *
	//  * @param image (BufferedImage).
	//  * @return n/a.
	//  */
	// private void setImage(BufferedImage image) {
	// 	this.image = image;
	// }

	// /**
	//  * getImate() returns the image of the SeamCarver object.
	//  *
	//  * @param n/a.
	//  * @return image (BufferedImage).
	//  */
	// private BufferedImage getImage() {
	// 	return this.image;
	// }

	// /**
	//  * getNum() returns the seamNumber of the SeamCarver object.
	//  *
	//  * @param n/a.
	//  * @return seamNumber (int).
	//  */
	// private Integer getNum() {
	// 	return this.seamNumber;
	// }

	// /**
	//  * setNum() sets the seamNumber of the SeamCarver object.
	//  *
	//  * @param new seamNumber (int).
	//  * @return n/a.
	//  */
	// private void setNum(Integer newSeamNumber) {
	// 	this.seamNumber = newSeamNumber;
	// }

	// /**
	//  * findSeam() xx
	//  *
	//  * @param xx
	//  * @return xx
	//  */
	// private Integer[] findSeam() { // specift the list later.
	// 	// Code
	// 	// Finds the minimum seam by looking at the energy table.
	// 	String direction = this.getDirection();
	// 	BufferedImage image = this.getImage();
	// 	int width = image.getWidth();
	// 	int height = image.getHeight();
	// 	int[][] energy_table = this.computeEnergy();

	// 	if (direction == 'v') {
	// 		int[] seam = new int[height];
	// 		// vertical
	// 		for (int y = 0; y < height; y++) {
	// 			for (int x = 0; x < width; x++) {
	// 				// xx
	// 			}
	// 		}
	// 	} else {
	// 		int[] seam = new int[width];
	// 		// horizontal
	// 		for (int x = 0; x < width; x++) {
	// 			for (int y = 0; y < height; y++) {
	// 				// xx
	// 			}
	// 		}
	// 	}
	// 	return seam;
	// }

	// /**
	//  * computeEnergy() takes an image and computes the energy table for that
	//  * image.
	//  *
	//  * @param buggered image.
	//  * @return table of energies (int).
	//  */
	// private int[][] computeEnergy() {
	// 	// Code
	// 	// Loops over each pixel and calculates its energy --> table.
	// 	BufferedImage image = this.getImage();
	// 	int width = image.getWidth();
	// 	int height = image.getHeight();
	// 	int[][] table = new int[width][height];

	// 	for (int y = 0; y < height; y++) {
	// 		for (int x = 0; x < width; x++) {
	// 			int color = image.getRGB(x, y);
 //                int alpha = (color & 0xff000000) >> 24;
 //                int red = (color & 0x00ff0000) >> 16;
 //                int green = (color & 0x0000ff00) >> 8;
 //                int blue = (color & 0x000000ff);

 //                // compute energy of the pixel.
 //                // need to have if/else if/else statements to cover the edge
 //                // cases.
 //                int energy = 0;

 //                // add energy to the energy table.
 //                table[x][y] = energy;
	// 		}
	// 	}
	// 	return table;
	// }

	// /**
	//  * removeSeam() xx
	//  *
	//  * @param xx
	//  * @return xx
	//  */
	// private void removeSeam() {
	// 	// Code
	// 	// Finds the minimum seam and removes it.
	// 	// calls findSeam()
	// 	// calls setNum() = getNum() - 1
	// 	int[] seam = this.findSeam();

	// 	// removes the seam
	// }

	// /**
	//  * carve() xx
	//  *
	//  * @param xx
	//  * @return xx
	//  */
	// private void carve() {
	// 	// Code
	// 	// Carves out the desired number of seams from the image. Displays the
	// 	// new image (without the carved seams).

	// 	while (this.getNum() > 0) {
	// 		// Code
	// 		// removeSeam() --> findSeam() --> computeEnergy()
	// 		// 				--> setNum() = getNum() - 1
	// 		this.removeSeam(this.getDirection());
	// 		this.setNum(this.getNum() - 1);
	// 	}

	// 	// showNew()
	// }
	
	// /**
	//  * showNew() opens the image without the seams that were removed.
	//  *
	//  * @param xx
	//  * @return n/a.
	//  */
	// private void showNew() {
	// 	// Code
	// 	// Displays the new image.
	// }

	// /**
	//  * showSeams() opens the image with the removed seams highlighted.
	//  *
	//  * @param xx
	//  * @return n/a.
	//  */
	// private void showSeams() {
	// 	// Code
	// 	// Shows which seams have been removed.
	// }

	public static void main(String[] args) {
		System.out.println("MAIN FUNCTION");

		boolean showImages = false;
		String imageFilePath = null;
		String outputImageFilePath = null;
		for (String arg: args) {
			if (arg.equals("--show")) {
				showImages = true;
			} else if (imageFilePath == null) {
				imageFilePath = arg;
			} else if (outputImageFilePath == null) {
				imageFilePath = arg;
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

        // code
	}
}