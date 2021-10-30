package Logic1;

public class With {
	
	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
	  if(noDoubles) {
	    if (die1 == die2) {
	      if (die1 != 6)
	        return die1 + 1 + die2;
	      else
	        return 1 + die2;
	    }
	  }
	  return die1 + die2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		With withoutDoubles=new With();
		System.out.println(With.withoutDoubles(2, 3, true));
		System.out.println(With.withoutDoubles(3, 3, true));
		System.out.println(With.withoutDoubles(3, 3, false));
		

	}

}
