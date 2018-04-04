package by.jb24.less06hw;

public class Group {
	private Student[] students;

	private int countOfStudents = 0;

	public Group(int groupSize) {
		students = new Student[groupSize];
	}

	public boolean add(Student st) {
		if (countOfStudents >= students.length) {
			return false;
		}

		students[countOfStudents] = st;//
		countOfStudents++;
		return true;
	}

	public int getCountOfStudents() {
		return countOfStudents;
	}

	public Student[] getStudents() {
		return students;
	}

}
