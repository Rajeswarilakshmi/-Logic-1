package Logic1;

public class Teen {
	public  static int teenSum(int a, int b) {
		  int sum = a+b;
		  if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19))
		    return 19;
		  else
		    return sum;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Teen teenSum=new Teen();
		    System.out.println(Teen.teenSum(3,4));
		    System.out.println(Teen.teenSum(10,13));
		    System.out.println(Teen.teenSum(13,2));

	}

}
