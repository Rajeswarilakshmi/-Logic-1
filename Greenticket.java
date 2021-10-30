package Logic1;

public class Greenticket {
	public static int  greenTicket(int a,int b,int c) {

			  if (a == b && b == c)
			    return 20;
			  if (a == b || a == c || b == c)
			    return 10;
			  else;
			    return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greenticket greenTicket=new Greenticket();
		System.out.println(Greenticket.greenTicket(1,2,3));
		System.out.println(Greenticket.greenTicket(2,2,2));
		System.out.println(Greenticket.greenTicket(1,1,2));
		

	}

}
