package Exception;
import java.util.Scanner;

public class e06ExcepetionInputMismatch {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Employee Id:");

		int empId = s.nextInt();

		System.out.println("Number is: "+empId);

	}

}