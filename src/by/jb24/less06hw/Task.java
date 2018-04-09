package by.jb24.less06hw;

//import java.util.*;

public class Task {

	public static void main(String[] args) {
		int studQuantity = 30;
		Group grp = new Group(studQuantity);

		Student stud1 = new Student("Vasya1", "Pupkin1", 5);
		Student stud2 = new Student("Vasya2", "Pupkin2", 5);
		Student stud3 = new Student("Vasya3", "Pupkin3", 5);
		Student stud4 = new Student("Vasya4", "Pupkin4", 5);
		Student stud5 = new Student("Vasya5", "Pupkin5", 5);

		if (grp.add(stud1)) {
			// System.out.println("Added stud1");
			stud1.setMark(4);
			stud1.setMark(5);
			stud1.setMark(4);
			stud1.setMark(3);
			stud1.setMark(4);

		}
		if (grp.add(stud2)) {
			// System.out.println("Added stud2");
			stud2.setMark(5);
			stud2.setMark(5);
			stud2.setMark(5);
			stud2.setMark(5);
			stud2.setMark(5);

		}
		if (grp.add(stud3)) {
			// System.out.println("Added stud3");
			stud3.setMark(3);
			stud3.setMark(3);
			stud3.setMark(4);
			stud3.setMark(3);
			stud3.setMark(5);

		}
		if (grp.add(stud4)) {
			// System.out.println("Added stud4");
			stud4.setMark(4);
			stud4.setMark(4);
			stud4.setMark(4);
			stud4.setMark(2);
			stud4.setMark(4);

		}
		if (grp.add(stud5)) {
			// System.out.println("Added stud5");
			stud5.setMark(3);
			stud5.setMark(3);
			stud5.setMark(2);
			stud5.setMark(2);
			stud5.setMark(3);

		}

		final GroupLogic grLogic = new GroupLogic();
		final StudentLogic stLogic = new StudentLogic();

		System.out.println("Students in group: " + grp.getCountOfStudents());
		System.out.println("Average by group: " + grLogic.getAvrMark(grp));
		System.out.println("Dumb(s) in group: " + grLogic.getDumb(grp));

		System.out.println("Average by student(s):");

		int countst = 0;
		for (Student s : grp.getStudents()) {
			if (countst < grp.getCountOfStudents()) {
				System.out.println(" " + s.getSurname() + " " + s.getName() + " : " + stLogic.getAvrMark(s));
				countst++;
			} else {
				break;
			}
			;
		}
		
	}

}
