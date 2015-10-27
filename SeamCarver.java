/**
 * SeamCarver.java
 * Frederik Roenn Stensaeth
 * Date: 10.27.15
 *
 * Java program to perform content-aware image resizing using seam carving.
 **/


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
		this.seamNumber = seamNumber;
		this.filename = filename;

		this.carve()
	}

	/**
	 * getNum() xx
	 *
	 * @param xx
	 * @return xx
	 */
	private int getNum() {
		// Code
		// Gets the seamNumber.
		return this.seamNumber;
	}

	/**
	 * setNum() xx
	 *
	 * @param xx
	 * @return xx
	 */
	private void setNum(int newSeamNumber) {
		// Code
		// Sets the seamNumber to the given value.
		this.seamNumber = newSeamNumber
	}

	/**
	 * findSeam() xx
	 *
	 * @param xx
	 * @return xx
	 */
	private List findSeam(xx) {
		// Code
		// Finds the minimum seam by looking at the energy table.
	}

	/**
	 * computeEnergy() xx
	 *
	 * @param xx
	 * @return xx
	 */
	private List computeEnergy(xx) {
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

		while this.getNum() > 0:
			// Code
			// removeSeam() --> findSeam() --> computeEnergy()
			// 				--> setNum() = getNum() - 1

		// showNew()
	}
	
	/**
	 * showNew() xx
	 *
	 * @param xx
	 * @return xx
	 */
	private void showNew(xx) {
		// Code
		// Displays the new image.
	}

	/**
	 * showSeams() xx
	 *
	 * @param xx
	 * @return xx
	 */
	private void showSeams(xx) {
		// Code
		// Shows which seams have been removed.
	}
}

public static void main(String[] args) throws Exception {
	if not 2 args given (file and carve number)
		error
		exit

	carve the given number of seams on the provided image 
		(might need to check for file extentions to ensure it is an image)
}