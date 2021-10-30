package Logic1;

public class Two {
	public  static boolean twoAsOne(int a, int b, int c) {
		  if ( a + b == c || c + b == a || c + a == b)
		    return true;
		  else
		    return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Two twoAsOne=new Two();
		    System.out.println(Two.twoAsOne(1,2,3));
		    System.out.println(Two.twoAsOne(3,1,2));
		    System.out.println(Two.twoAsOne(3,2,2));

	}

}
