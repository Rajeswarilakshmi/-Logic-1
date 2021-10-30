package Logic1;

public class More {
	public  static boolean more20(int n) {
		  return (n % 20) == 1 || (n % 20) == 2;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 More more20=new More();
		 System.out.println(More.more20(20));
		 System.out.println(More.more20(21));
		 System.out.println(More.more20(22));

	}

}
