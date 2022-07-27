package Array;

public class a1SingleMulDIM {

	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

//		System.out.println(a.length);
//		System.out.println(a[2]);
//
//		for (int i = 0; i < a.length; i++) {//
//			System.out.println(a[i]);// 0 1 2 3 4 - 5
//		}

//		System.out.println();

		for (int i : a) { // i: a
			System.out.println(i);
		}
		
		int x = 3;
		int y = 2;
		int z = 1;			//3>2 ,  3>1
		int largestNumber = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("The largest numbers is:  " + largestNumber);

		int b[][] = new int[3][3];

		b[0][0] = 11;
		b[0][1] = 22;
		b[0][2] = 33;

		b[1][0] = 44;
		b[1][1] = 55;
		b[1][2] = 66;

		b[2][0] = 44;
		b[2][1] = 55;
		b[2][2] = 66;

		for (int i = 0; i < 3; i++) { // 1
			for (int j = 0; j < 3; j++) {// 0
				System.out.print(b[i][j] + " ");// 1,0=3
			}
			System.out.println("");
		}

	}

}
