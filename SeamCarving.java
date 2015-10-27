/**
 * SeamCarving.java
 * Frederik Roenn Stensaeth
 * Date: 10.27.15
 *
 * Java program to perform content-aware image resizing using seam carving.
 **/


import java.awt.image.BufferedImage;

public class SeamCarver {
	values:
		seam number
		file name

	methods:
		findSeam (finds the min seam)
		carve (carves out the seams)
		removeSeam (removes a seam)
		printCarved (opens the new image)
		getNum/setNum (gets and sets the seam number ~ for updating purposes)

	public SeamCarver(File filename, int seamNumber) {
		this.seamNumber = seamNumber;
		this.filename = filename;

		this.carve()
	}

	private int getNum() {
		return this.seamNumber;
	}

	private void setNum(int newSeamNumber) {
		this.seamNumber = newSeamNumber
	}

	private List findSeam(xx) {
		// Code
	}

	private List computeEnergy(xx) {
		// Code
	}

	private void removeSeam(xx) {
		// Code
	}

	private void carve(xx) {
		// Code

		while this.getNum() > 0:
			// Code
			// removeSeam() --> findSeam() --> computeEnergy()
			// 				--> setNum() = getNum() - 1

		// printCarved()
	}

	private void printCarved(xx) {
		// Code
	}
}

public static void main(String[] args) throws Exception {
	if not 2 args given (file and carve number)
		error
		exit

	carve the given number of seams on the provided image 
		(might need to check for file extentions to ensure it is an image)
}