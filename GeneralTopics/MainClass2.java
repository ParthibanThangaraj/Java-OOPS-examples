package GeneralTopics;

class Program {
	static int x = 10;
	int y = 20;
	double z = 33.33;
}

class MainClass2 {

	public static void main(String[] args) {
		
		System.out.println("x value: "+Program.x);
		Program.x=100;
		System.out.println("\nx value: "+new Program().x);
		Program.x=110;
		System.out.println("\nx value: "+new Program().x);
		Program.x=1000;
		System.out.println("\nx value: "+new Program().x);
		
		System.out.println("\ny value: "+new Program().y);
		System.out.println("z value: "+new Program().z);
		
		new Program().y =200;
		new Program().z=333.33;
		
		System.out.println("\ny value: "+new Program().y);
		System.out.println("z value: "+new Program().z);
		
		new Program().y =300;
		new Program().z=444.44;
		
		System.out.println("\ny value: "+new Program().y);
		System.out.println("z value: "+new Program().z);
		
	}

}
