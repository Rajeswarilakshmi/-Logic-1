package Logic1;

public class Fizz {
	public  static String fizzString(String str) {
	    boolean fizz = str.charAt(0) == 'f';
	    boolean buzz = str.charAt(str.length() - 1) == 'b';
	    if (fizz && buzz) return "FizzBuzz";
	    if (fizz) return "Fizz";
	    if (buzz) return "Buzz";
	    return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fizz  fizzString=new Fizz();
	    System.out.println(Fizz.fizzString("fig"));
	    System.out.println(Fizz.fizzString("dib"));
	    System.out.println(Fizz.fizzString("fib"));

	}

}
