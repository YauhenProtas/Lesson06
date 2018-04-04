package by.jb24.less06hw;

public class Student {
	private String name;
	private String surname;
	private double[] marks;

	private int countOfMarks = 0;

	public Student(String name, String surname, int numberOfSubjects) {
		this.name = name;
		this.surname = surname;
		marks = new double[numberOfSubjects];
	}

	public boolean setMark(double currentMark) {
		if (countOfMarks >= marks.length) {
			return false;
		}

		marks[countOfMarks] = currentMark;//
		countOfMarks++;
		return true;
	}

	public String getName() {
		return name;
	}

	public int getCountOfMarks() {
		return countOfMarks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double[] getMarks() {
		return marks;
	}

}
