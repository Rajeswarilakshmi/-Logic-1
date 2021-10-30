package Logic1;

public class LessBy {
	public  static boolean lessBy10(int a, int b, int c) {
		  int high = Math.max(a,b);
		  high = Math.max(high, c);
		  if (high - a >= 10 || high - b >= 10 || high - c >=10)
		    return true;
		  else
		    return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LessBy lessBy10=new LessBy();
		    System.out.println(LessBy.lessBy10(1,7,11));
		    System.out.println(LessBy.lessBy10(1,7,10));
		    System.out.println(LessBy.lessBy10(11,1,7));

	}

}
