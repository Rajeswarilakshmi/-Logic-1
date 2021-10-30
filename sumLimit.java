package Logic1;

public class sumLimit {
	public int sumLimit(int a, int b) {
	  String aString = String.valueOf(a);
	  int aLen = aString.length();
	  String sumString = String.valueOf(a+b);
	  int sumLen = sumString.length();
	  if (sumLen == aLen)
	    return a + b;
	  else
	    return a;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumLimit sumLimit=new sumLimit();
		System.out.println(sumLimit.sumLimit(2, 3));
		System.out.println(sumLimit.sumLimit(8, 3));
		System.out.println(sumLimit.sumLimit(8, 1));

	}

}
