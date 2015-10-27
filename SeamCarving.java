
import java.awt.image.BufferedImage;

public class SeamCarver {
	values:
		seam number
		file name

	methods:
		findSeam (finds the min seam)
		carve (carves out the min seam)
		print (opens the new image)
		getNum/setNum (gets and sets the seam number ~ for updating purposes)
}

public static void main(String[] args) throws Exception {
	if not 2 args given (file and carve number)
		error
		exit

	carve the given number of seams on the provided image 
		(might need to check for file extentions to ensure it is an image)
}