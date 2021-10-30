package Logic1;

public class In {
	public  static boolean inOrder(int a, int b, int c, boolean bOk) {
		  if(bOk) {
		    if (c > b)

		      return true;
		    else
		      return false;
		  }
		  if (b > a && c > b)
		    return true;
		  else
		    return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 In inOrder=new In();
		    System.out.println(In.inOrder(1,2,4,false));
		    System.out.println(In.inOrder(1,2,1,false));
		    System.out.println(In.inOrder(1,1,2,true));

	}

}
