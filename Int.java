package Logic1;

public class Int {
	public static boolean in1To10(int n, boolean outsideMode) {

		  if (!outsideMode){

		    if (n >= 1 && n <= 10) {

		      return true;

		    } else {

		        return false;

		      }

		  } else {

		      if (n <= 1 || n >= 10) {

		        return true;

		      } else {

		          return false;

		        }
		    }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Int in1To10=new Int();
		System.out.println(Int.in1To10(5,false));
		System.out.println(Int.in1To10(11,false));
		System.out.println(Int.in1To10(11,true));

	}

}
