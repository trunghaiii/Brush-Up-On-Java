package string;

import java.util.ArrayList;

public class StringProgram2 {

	public static void main(String[] args) {

		Student st1 = new Student("Tom Tran", 1);
		Student st2 = new Student("Ken Tran", 2);
		Student st3 = new Student("Tom Nguyen", 3);
		Student st4 = new Student("Ken Nguyen", 4);
		Student st5 = new Student("Thu Pham", 5);

		ArrayList<Student> studentArr = new ArrayList();
		studentArr.add(st1);
		studentArr.add(st2);
		studentArr.add(st3);
		studentArr.add(st4);
		studentArr.add(st5);

		for (int i = 0; i < studentArr.size(); i++) {

			if (studentArr.get(i).getName().startsWith("Tom")) {
				System.out.println("This is student with name Tom: " + studentArr.get(i) + "\n");
			}
		}

	}

}
