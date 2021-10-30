package Logic1;

public class Old {
	public  static boolean old35(int n) {
	    return n % 3 == 0 ^ n % 5 == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Old old35=new Old();
	    System.out.println(Old.old35(3));
	    System.out.println(Old.old35(10));
	    System.out.println(Old.old35(15));

	}

}
