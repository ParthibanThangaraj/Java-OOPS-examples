package FileOperations;

import java.io.File;

public class FileOp2FileExecutions {

	public static void main(String[] args) throws Exception {

		File f = new File(

				"D:\\#Green Technologie Core & Advanced Java\\Tasks\\10.File Operations\\Java1\\Program1.txt");

		boolean createNewFile = f.createNewFile();

		System.out.println(createNewFile);

		boolean file = f.isFile();

		System.out.println(file);

		boolean directory = f.isDirectory();

		System.out.println(directory);

		boolean canExecute = f.canExecute();

		System.out.println(canExecute);

		boolean canWrite = f.canWrite();

		System.out.println(canWrite);

		boolean canRead = f.canRead();

		System.out.println(canRead);

	}

}