package Logic1;

public class squirrelPlay {
	public  static boolean squirrelPlay(int temp, boolean isSummer) {
		  if (isSummer && temp <= 100 && temp >= 60)
		    return true;
		  if (!(isSummer) && temp <= 90 && temp >=60)
		    return true;
		  else
		    return false;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squirrelPlay squirrelPlay=new squirrelPlay();
		System.out.println(squirrelPlay.squirrelPlay(70, false));
		System.out.println(squirrelPlay.squirrelPlay(95, false));
		System.out.println(squirrelPlay.squirrelPlay(95, true));

	}

}
