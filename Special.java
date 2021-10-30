package Logic1;

public class Special {

    public  static boolean specialEleven(int n) {
        return n % 11 == 0 || (n - 1) % 11 == 0 ? true : false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Special specialEleven=new Special();   
		System.out.println(Special.specialEleven(22));
		System.out.println(Special.specialEleven(23));
		System.out.println(Special.specialEleven(24));

	}

}
