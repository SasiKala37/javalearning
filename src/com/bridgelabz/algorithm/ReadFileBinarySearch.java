package com.bridgelabz.algorithm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBinarySearch {

	public static void main(String[] args) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("/home/bridgelabz/sasi-txtdocuments/names.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// printStrings;
		int i;
		try {
			while ((i = fileReader.read()) != -1) {
				System.out.print((char) i);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
