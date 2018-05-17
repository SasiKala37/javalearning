package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
    	System.out.println("Enter the x and y co-ordinates");
    	// parse x- and y-coordinates from command-line arguments
    	int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        
        double distance=utility.findDistance(x, y);
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
	}

}
