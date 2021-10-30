package Logic1;

public class Date {
	public  static int dateFashion(int you, int date) {
		  if ((you >= 8 && date > 2) || (date >= 8 && you > 2))
		    return 2;
		  if (you <= 2 || date <= 2)
		    return 0;
		  else
		    return 1;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dateFashion=new Date();
		System.out.println(Date.dateFashion(5, 10));
		System.out.println(Date.dateFashion(5, 2));
		System.out.println(Date.dateFashion(5, 5));

	}

}
