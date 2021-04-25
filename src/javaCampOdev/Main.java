package javaCampOdev;

public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses(1, "JAVA + REACT","Engin Demiroğ");
		Courses course2 = new Courses(2, "C# + ANGULAR","Engin Demiroğ");
		Courses course3 = new Courses(3, "PROGRAMLAMAYA GİRİŞ","Engin Demiroğ");
		
		Courses[] courses= {course1,course2,course3};
		
		for (Courses course : courses) {
			System.out.println(course.name);
			System.out.println(course.instructor);
		}
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.registerCourse(course1);
		courseManager.registerCourse(course2);
		courseManager.registerCourse(course3);
		
		
		courseManager.deleteCourse(course1);
		

	}

}
