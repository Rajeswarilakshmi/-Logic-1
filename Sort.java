package Logic1;

public class Sort {
	public  static int sortaSum(int a, int b) {

		  int sum = a+b;

		  if(sum >= 10 && sum <= 19)

		    return 20;

		  else

		    return sum;

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort sortaSum=new Sort();
		System.out.println(Sort.sortaSum(3,4));
		System.out.println(Sort.sortaSum(9,4));
		System.out.println(Sort.sortaSum(10,11));

	}

}
