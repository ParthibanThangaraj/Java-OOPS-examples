package FileOperations;

import java.io.File;

public class FileOp1Directory {

	public static void main(String[] args) throws Exception {

		File f = new File(

				"D:\\#Green Technologie Core & Advanced Java\\Tasks\\10.File Operations\\Java1\\Program1.txt");

		/*
		 * 
		 * // 1. To create a directory / Folder
		 * 
		 * 
		 * 
		 * boolean mkdir = f.mkdir(); System.out.println(mkdir);
		 * 
		 */

// 2. To create a directory / Folder 

		boolean mkdirs = f.mkdirs();

		System.out.println(mkdirs);

	}

}