package Logic1;

public class Less {
	public static  boolean less20(int n) {
	    return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Less less20=new Less();
		    System.out.println(Less.less20(18));
		    System.out.println(Less.less20(19));
	        System.out.println(Less.less20(20));

	}

}
