package Logic1;

public class RedTicket {
	public static int redTicket(int a, int b, int c){
		 if (a == 2 && b == 2 && c == 2)
			     return 10;
			   if ( a == b && b == c)
			     return 5;
			   if ( a != b && a != c)
			     return 1;
			   else
			     return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedTicket redTicket=new RedTicket();
		System.out.println(RedTicket.redTicket(2,2,2));
		System.out.println(RedTicket.redTicket(2,2,1));
		System.out.println(RedTicket.redTicket(0,0,0));

	}

}
