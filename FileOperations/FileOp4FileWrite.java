//package FileOperations;
//
//import java.io.File;
//import java.util.List;
//
//import org.apache.commons.io.FileUtils;
//
//public class FileOp4FileWrite {
//
//	public static void main(String[] args) throws Exception {
//
//		File f = new File("D:\\#Green Technologie Core & Advanced Java\\Tasks\\10.File Operations\\Java1\\Example.txt");
//
//// FileUtils.write(f, "Welcome", false); 
//
//// System.out.println("Done"); 
//
//		FileUtils.write(f, " Python\n", true);
//
//		FileUtils.write(f, " Selenium\n", true);
//
//		List<String> readLines = FileUtils.readLines(f);
//
//		System.out.println(readLines);
//
//		for (String string : readLines) {
//
//			System.out.println(string);
//
//		}
//
//		String readFileToString = FileUtils.readFileToString(f);
//
//		System.out.println(readFileToString);
//
//	}
//
//}