package StringOperations;
public class StringMethods {

	public static void main(String[] args) {

// length 			12345678910 11 12 13 14 15 16 
		String s = "Java Application";
// index 			012345678910 11 12 13 14 15
		
		System.out.println(s);

// to find the length ( press (ctrl+2), release and press l) 
		
	
		
		int l = s.length(); 
		System.out.println(l);

// to find the given string is empty or not 
				
		boolean b = s.isEmpty();
		System.out.println(b);

// to find the particular character 
		char c = s.charAt(5);
		System.out.println(c);

// char c1 = s.charAt(16); 

// System.out.println(c1); // if given the wrong value 

// Error:java.lang.StringIndexOutOfBoundsException 

// to find the index position 

		int iO = s.indexOf('n');

		System.out.println(iO);

// to find the last index position 

		int lI = s.lastIndexOf('a');

		System.out.println(lI);

// to Check the given string start or not 

		boolean sW = s.startsWith("Ja");

		System.out.println(sW);

// to Check the given string endswith or not 

		boolean eW = s.endsWith("on");

		System.out.println(eW);

// to convert small letter to Upper Case 
		String uC = s.toUpperCase();
		System.out.println(uC);

// to convert small letter to Lower Case 
		String lC = s.toLowerCase();
		
		System.out.println(lC);

// to check the particular word find or not 
		boolean contains = s.contains("tion");
		System.out.println(contains);

// to replace the particular char 
		String sR = s.replace('a', 'z');
		System.out.println(sR);

// to replace the whole word 
		String rSA = s.replaceAll("App", "Webapp");
		System.out.println(rSA);

// to remove the unwanted space 
		String s3 = "    Hello   ";
		System.out.println(s3);
		
		String trim = s3.trim();
		System.out.println(trim);

// to get the another string 
		String sSub1 = s.substring(5);
		System.out.println(sSub1);
		
		String sSub2 = s.substring(5, 9);
		System.out.println(sSub2);

// Join the two string 
		String a = "Apple";
		String a1 = "apple";
		
		String concat = s.concat(a1);
		System.out.println(concat);

// to check the given string is equal or not 

		boolean e = a.equals(a1);
		System.out.println(e);

		boolean equalsIgnoreCase = a.equalsIgnoreCase(a1);
		System.out.println(equalsIgnoreCase);

// compareTo(); 

// split(); 

	}

}