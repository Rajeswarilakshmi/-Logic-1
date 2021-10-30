package Logic1;

public class Answer {
	public  static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		  if (isAsleep)
		    return false;
		  if ((isMorning && isMom) || !isMorning)
		    return true;
		  else return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Answer answerCell=new Answer();
		    System.out.println(Answer.answerCell(false,false,true));
		    System.out.println(Answer.answerCell(false,false,false));
		    System.out.println(Answer.answerCell(true,false,false));

	}

}
