package Logic1;

public class Alarm {
	public  static String alarmClock(int day, boolean vacation) {

		  if (vacation) {

		    if(day > 0 && day != 6)

		      return "10:00";

		    else

		      return "off";

		  } else if (day > 0 && day != 6)

		      return "7:00";

		    else

		      return "10:00";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alarm alarmClock=new Alarm();
		System.out.println(Alarm.alarmClock(1,false));
		System.out.println(Alarm.alarmClock(5,false));
		System.out.println(Alarm.alarmClock(0,false));

	}

}
