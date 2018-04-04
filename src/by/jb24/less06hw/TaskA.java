package by.jb24.less06hw;

import java.util.Random;

public class TaskA {

	public static void main(String[] args) {
		Random mark = new Random();
		int studQuantity = 100;
		Group grp = new Group(studQuantity);
		Student stud = new Student("Vasya", "Pupkin", 0);

		for (int i = 0; i < studQuantity; i++) {
			stud.setName("Vasya" + i);
			stud.setSurname("Pupkin" + i);
			stud.setMark(1 + mark.nextInt(5));
			grp.add(stud);
		}
		//grp.getStudents();
		System.out.println(grp.getStudents());
	}
	
}
