package Logic1;

public class Sharedigit {
	public  static boolean shareDigit(int a, int b) {
		  int aL = a / 10;
		  int aR = a % 10;
		  int bL = b / 10;
		  int bR = b % 10;
		  if (aL == bL || aL == bR || aR == bL || aR == bR)
		    return true;
		  else
		    return false;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Sharedigit.shareDigit(12, 23));
		System.out.println(Sharedigit.shareDigit(12, 43));
		System.out.println(Sharedigit.shareDigit(12, 44));

	}

}
