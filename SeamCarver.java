/**
 * SeamCarver.java
 * Frederik Roenn Stensaeth
 * Date: 10.27.15
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
	public SeamCarver(File filename, int seamNumber) {
		// Open the input image
        BufferedImage this.image;
        try {
            this.image = ImageIO.read(new File(filename));
        } catch(IOException e) {
            System.err.println("Can't open " + filename);
            return;
        }

        if (seamNumber < 1) {
        	System.err.println("Can't open " + filename);
            return;
        } else {
        	this.seamNumber = seamNumber;
        }

		this.carve()
	}

	/**
	 * getNum() returns the seamNumber of the SeamCarver object.
	 *
	 * @param n/a.
	 * @return seamNumber (int).
	 */
	private int getNum() {
		return this.seamNumber;
	}

	/**
	 * setNum() sets the seamNumber of the SeamCarver object.
	 *
	 * @param new seamNumber (int).
	 * @return n/a.
	 */
	private void setNum(int newSeamNumber) {
		this.seamNumber = newSeamNumber
	}

	/**
	 * findSeam() xx
	 *
	 * @param xx
	 * @return xx
	 */
	private List findSeam(xx) { // specift the list later.
		// Code
		// Finds the minimum seam by looking at the energy table.
	}

	/**
	 * computeEnergy() xx
	 *
	 * @param xx
	 * @return xx
	 */
	private List computeEnergy(xx) { // specify the list later.
		// Code
		// Loops over each pixel and calculates its energy --> table.
	}

	/**
	 * removeSeam() xx
	 *
	 * @param xx
	 * @return xx
	 */
	private void removeSeam(xx) {
		// Code
		// Finds the minimum seam and removes it.
	}

	/**
	 * carve() xx
	 *
	 * @param xx
	 * @return xx
	 */
	private void carve() {
		// Code
		// Carves out the desired number of seams from the image. Displays the
		// new image (without the carved seams).

		while this.getNum() > 0 {
			// Code
			// removeSeam() --> findSeam() --> computeEnergy()
			// 				--> setNum() = getNum() - 1
		}

		// showNew()
	}
	
	/**
	 * showNew() opens the image without the seams that were removed.
	 *
	 * @param xx
	 * @return n/a.
	 */
	private void showNew(xx) {
		// Code
		// Displays the new image.
	}

	/**
	 * showSeams() opens the image with the removed seams highlighted.
	 *
	 * @param xx
	 * @return n/a.
	 */
	private void showSeams(xx) {
		// Code
		// Shows which seams have been removed.
	}

	public static void main(String[] args) throws Exception {
		// if not 2 args given (file and carve number)
		// 	error
		// 	exit
		if (args.length != 2) {
			System.out.println('Error, incorrect number of arguments provided.');
			System.out.println('Usage: $ SeamCarver <filename> <number of seams (int)>')
			System.exit(1);
		}

		// carve the given number of seams on the provided image 
		// 	(might need to check for file extentions to ensure it is an image)
		try {
			SeamCarver sc = new SeamCarver(args[0], args[1])
		} catch {
			System.out.println('Error, incorrect arguments provided.');
			System.out.println('Usage: $ SeamCarver <filename> <number of seams (int)>')
			System.exit(1);
		}
	}
}