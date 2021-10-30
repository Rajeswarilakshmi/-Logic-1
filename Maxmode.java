package Logic1;

public class Maxmode {
	public static int maxMode(int a, int b) {

			  if (a == b)
			    return 0;
			  if (a % 5 == b % 5)
			    return Math.min(a,b);
			  return Math.max(a,b);
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maxmode maxMode=new Maxmode();
		System.out.println(Maxmode.maxMode(5,2));
		System.out.println(Maxmode.maxMode(6,2));
		System.out.println(Maxmode.maxMode(3,2));
		

	}

}
