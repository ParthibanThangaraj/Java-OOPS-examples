package FileOperations;

import java.io.File;

public class FileOp3WithLoopsforReadFiles {

	public static void main(String[] args) throws Exception {

		File f = new File("D:\\#Green Technologie Core & Advanced Java\\Tasks");

		String[] list = f.list();

// System.out.println(list); it will show a memory allocations - 

// [Ljava.lang.String;@36baf30c 

// so, we use for loop 

		for (String string : list) {

			System.out.println(string);

		}

		File[] listFiles = f.listFiles();

		for (File file : listFiles) {

			System.out.println(file);

		}

	}

}