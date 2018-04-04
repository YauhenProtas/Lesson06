package by.jb24.less06hw;

public class GroupLogic {

	private final StudentLogic stLogic = new StudentLogic();

	private static final int MAX_MARK = 5;

	public double getAvrMark(Group gr) {
	  double avr = 0;

	  for (Student st : gr.getStudents()) {
	   if (st != null) {
	    avr = avr + stLogic.getAvrMark(st);
	   }
	  }

	  avr = avr / gr.getCountOfStudents();

	  return avr;
	 }

	public int getCountAStudent(Group gr) {
	  int count = 0;

	  for (Student st : gr.getStudents()) {
	   if (st != null) {
	    return count;
	   }

	   if (stLogic.getAvrMark(st) >= MAX_MARK) {
	    count++;
	   }
	  }

	  return count;
	 }
}