package Logic1;

public class Love {
	public  static boolean love6(int a, int b) {

		  if (a == 6 || b == 6)

		    return true;
		  
		  int sum = a+b;

		  int diff = Math.abs(a-b);
		  if (sum == 6 || diff == 6)

		    return true;
		  else
		    return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Love love6=new Love();
		System.out.println(Love.love6(6,4));
		System.out.println(Love.love6(4,5));
		System.out.println(Love.love6(1,5));

	}

}
