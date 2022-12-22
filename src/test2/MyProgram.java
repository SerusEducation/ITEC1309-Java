package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class MyProgram {

	public static void main(String[] args) {
		
		final int number = 3;
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<Student>();
		
		for (int i = 0; i < number; i++) {
			System.out.println("Student [" + (i + 1) + "]");
			Student student = new Student();
			
			System.out.print("code: ");
			student.setCode(sc.nextLine());
			System.out.print("name: ");
			student.setName(sc.nextLine());
			System.out.print("age: ");
			student.setAge(sc.nextInt());
			sc.nextLine();
			
			students.add(student);
		}

		sc.close();
		
		System.out.println("========= Result Print =========");

		for (int i = 0; i < number; i++) {
			System.out.println(students.get(i));
		}
		

	}

}
