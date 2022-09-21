package dad.codesignal;

import java.util.Arrays;

public class EdgeOfTheOcean {

	/*
	 * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
	 */
	
	public int getLargestProduct(int[] array) {
		int aux = array[0] * array[1];
	    for(int i = 0; i < array.length - 1; i++) {
	        if(array[i] * array[i+1] > aux)
	            aux = array[i] *= array[i+1];
	    }
	    return aux;
	}
	
	/*
	 * Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
		A 1-interesting polygon is just a square with a side of length 1. 
		An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting 
		polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
	 */
	
	public int  getAreaOfInterestingPolygon(int n) { //area = l*l;
		int lado, area;
		lado = (n*2);
		area = (lado * lado)/2;
		return area+1;
	}
	
}
