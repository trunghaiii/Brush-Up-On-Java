package oop;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();

		student1.name = "Hai Tran";
		student1.age = 22;
		student1.sex = "Male";

		Student student2 = new Student();

		student2.name = "Tom Tran";
		student2.age = 23;
		student2.sex = "Male";

		System.out.println("student1 name: " + student1.name);
		System.out.println("student1 age: " + student1.age);
		System.out.println("student1 sex: " + student1.sex);

		System.out.println("student2 name: " + student2.name);
		System.out.println("student2 age: " + student2.age);
		System.out.println("student2 sex: " + student2.sex);

	}

}
