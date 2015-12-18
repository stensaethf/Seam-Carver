# Seam-Carver
A Java program for content-aware image resizing using seam carving.
Algorithm: Seam Carving for Content-Aware Image Resizing, Shai Avidan & Ariel Shamir

Usage:
$ java SeamCarver \<inputImage.jpg/png\> \<outputImage.png\> \<numOfSeams\> \<seamDirection\> [--show]

* inputImage: the image to be resized. Can either be jpg or png.
* outputImage: the desired filename for the resized image. Will be a png file.
* numOfSeams: number of seams that will be removed from the original image.
* seamDirection: either horizontal or vertical.
* --show: for displaying the original and new images once the algorithm is done.
