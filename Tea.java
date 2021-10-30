package Logic1;

public class Tea {
	public  static int teaParty(int tea, int candy) {
		  if (tea < 5 || candy < 5)
		    return 0;
		  if ((tea >= 2 * candy) || (candy >= 2 * tea))
		    return 2;
		  else
		    return 1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea teaParty=new Tea();
        System.out.println(Tea.teaParty(6,8));
        System.out.println(Tea.teaParty(3,8));
        System.out.println(Tea.teaParty(20,8));

	}

}
